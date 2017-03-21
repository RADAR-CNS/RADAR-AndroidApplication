package org.radarcns.empaticaE4;

import android.os.Parcel;
import android.os.Parcelable;

import com.empatica.empalink.config.EmpaSensorStatus;
import com.empatica.empalink.config.EmpaSensorType;

import org.radarcns.android.BaseDeviceState;
import org.radarcns.util.DeviceStateCreator;

import java.util.EnumMap;
import java.util.Map;

/**
 * The status on a single point in time of an Empatica E4 device.
 */
public class E4DeviceStatus extends BaseDeviceState {
    private float[] acceleration = {Float.NaN, Float.NaN, Float.NaN};
    private float batteryLevel = Float.NaN;
    private float bloodVolumePulse = Float.NaN;
    private float electroDermalActivity = Float.NaN;
    private float interBeatInterval = Float.NaN;
    private float temperature = Float.NaN;
    private final Map<EmpaSensorType, EmpaSensorStatus> sensorStatus = new EnumMap<>(EmpaSensorType.class);

    public static final Parcelable.Creator<E4DeviceStatus> CREATOR = new DeviceStateCreator<>(E4DeviceStatus.class);

    @Override
    public synchronized void writeToParcel(Parcel dest, int flags) {
        super.writeToParcel(dest, flags);
        dest.writeFloat(this.acceleration[0]);
        dest.writeFloat(this.acceleration[1]);
        dest.writeFloat(this.acceleration[2]);
        dest.writeFloat(this.batteryLevel);
        dest.writeFloat(this.bloodVolumePulse);
        dest.writeFloat(this.electroDermalActivity);
        dest.writeFloat(this.interBeatInterval);
        dest.writeFloat(this.temperature);
        dest.writeInt(sensorStatus.size());
        for (Map.Entry<EmpaSensorType, EmpaSensorStatus> sensor : sensorStatus.entrySet()) {
            dest.writeInt(sensor.getKey().ordinal());
            dest.writeInt(sensor.getValue().ordinal());
        }
    }

    public void updateFromParcel(Parcel in) {
        super.updateFromParcel(in);
        acceleration[0] = in.readFloat();
        acceleration[1] = in.readFloat();
        acceleration[2] = in.readFloat();
        batteryLevel = in.readFloat();
        bloodVolumePulse = in.readFloat();
        electroDermalActivity = in.readFloat();
        interBeatInterval = in.readFloat();
        temperature = in.readFloat();
        int numSensors = in.readInt();
        for (int i = 0; i < numSensors; i++) {
            sensorStatus.put(EmpaSensorType.values()[in.readInt()], EmpaSensorStatus.values()[in.readInt()]);
        }
    }

    @Override
    public boolean hasAcceleration() {
        return true;
    }

    @Override
    public float[] getAcceleration() {
        return acceleration;
    }

    public synchronized void setAcceleration(float x, float y, float z) {
        this.acceleration[0] = x;
        this.acceleration[1] = y;
        this.acceleration[2] = z;
    }

    @Override
    public float getBatteryLevel() {
        return batteryLevel;
    }

    public synchronized void setBatteryLevel(float batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public float getBloodVolumePulse() {
        return bloodVolumePulse;
    }

    public synchronized void setBloodVolumePulse(float bloodVolumePulse) {
        this.bloodVolumePulse = bloodVolumePulse;
    }

    public float getElectroDermalActivity() {
        return electroDermalActivity;
    }

    public synchronized void setElectroDermalActivity(float electroDermalActivity) {
        this.electroDermalActivity = electroDermalActivity;
    }

    public float getInterBeatInterval() {
        return interBeatInterval;
    }

    @Override
    public boolean hasHeartRate() {
        return true;
    }

    @Override
    public float getHeartRate() {
        return 60 / interBeatInterval;
    }

    public synchronized void setInterBeatInterval(float interBeatInterval) {
        this.interBeatInterval = interBeatInterval;
    }

    @Override
    public boolean hasTemperature() {
        return true;
    }

    @Override
    public float getTemperature() {
        return temperature;
    }

    public synchronized void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public Map<EmpaSensorType, EmpaSensorStatus> getSensorStatus() {
        return sensorStatus;
    }

    public synchronized void setSensorStatus(EmpaSensorType type, EmpaSensorStatus status) {
        sensorStatus.put(type, status);
    }
}
