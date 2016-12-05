#include <pebble.h>
#include "main.h"
#include "../common.h"

static Window *s_main_window;
static Layer *s_main_layer;
static GRect window_frame;
static int status;

static void select_click_handler(ClickRecognizerRef recognizer, void *context) {
  AppWorkerMessage msg;
  app_worker_send_message(WORKER_KEY_TOGGLE_LOGGING, &msg);
}

static void click_config_provider(void *context) {
  window_single_click_subscribe(BUTTON_ID_SELECT, select_click_handler);
}

static void worker_message_handler(uint16_t type, AppWorkerMessage *data) {
  switch (type) {
    case WORKER_KEY_STATUS:
      status = data->data0;
      break;
  }
  layer_mark_dirty(s_main_layer);
}

static void main_layer_update_proc(Layer *layer, GContext *ctx) {
  GRect bounds = layer_get_bounds(layer);

  graphics_context_set_fill_color(ctx, GColorWhite);
  graphics_fill_circle(ctx, GPoint(bounds.size.w, bounds.size.h / 2), 5);

  GRect text_bounds;
  text_bounds.origin.x = bounds.origin.x;
  text_bounds.origin.y = (bounds.size.h / 2) - 13;
  text_bounds.size.w = bounds.size.w;
  text_bounds.size.h = 20;

  const char *status_text;
  if (status == WORKER_STATUS_RUNNING) {
    status_text = "collecting...";
  } else {
    status_text = "disabled";
  }

  GFont id_font = fonts_get_system_font(FONT_KEY_GOTHIC_18_BOLD);
  graphics_context_set_text_color(ctx, GColorWhite);
  graphics_draw_text(ctx, status_text, id_font, text_bounds,
                     GTextOverflowModeFill, GTextAlignmentCenter, NULL);
}

static void main_window_load(Window *window) {
  Layer *window_layer = window_get_root_layer(window);
  GRect frame = window_frame = layer_get_frame(window_layer);
  s_main_layer = layer_create(frame);
  layer_set_update_proc(s_main_layer, main_layer_update_proc);
  layer_add_child(window_layer, s_main_layer);
}

static void main_window_unload(Window *window) {
  layer_destroy(s_main_layer);
}

static void init(void) {
  status = WORKER_STATUS_DISABLED;

  s_main_window = window_create();
  window_set_background_color(s_main_window, GColorBlack);
  window_set_window_handlers(s_main_window, (WindowHandlers) {
    .load = main_window_load,
    .unload = main_window_unload
  });
  window_stack_push(s_main_window, true);
  window_set_click_config_provider(s_main_window, click_config_provider);

  app_worker_launch();
  app_worker_message_subscribe(worker_message_handler);
}

static void deinit(void) {
  app_worker_message_unsubscribe();
  window_destroy(s_main_window);
}

int main(void) {
  init();
  app_event_loop();
  deinit();
}