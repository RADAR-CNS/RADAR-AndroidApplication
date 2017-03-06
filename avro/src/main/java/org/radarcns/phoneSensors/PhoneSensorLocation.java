/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package org.radarcns.phoneSensors;  
@SuppressWarnings("all")
/** Data from the gps and network location providers. */
@org.apache.avro.specific.AvroGenerated
public class PhoneSensorLocation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PhoneSensorLocation\",\"namespace\":\"org.radarcns.phoneSensors\",\"doc\":\"Data from the gps and network location providers.\",\"fields\":[{\"name\":\"time\",\"type\":\"double\",\"doc\":\"device timestamp in UTC (s)\"},{\"name\":\"timeReceived\",\"type\":\"double\",\"doc\":\"device receiver timestamp in UTC (s)\"},{\"name\":\"provider\",\"type\":\"int\",\"doc\":\"1-GPS, 2-Network, 3-Other\"},{\"name\":\"latitude\",\"type\":\"double\",\"doc\":\"from a random reference latitude\"},{\"name\":\"longitude\",\"type\":\"double\",\"doc\":\"from a random reference longitude\"},{\"name\":\"altitude\",\"type\":\"float\",\"doc\":\"height above the WGS 84 (m)\"},{\"name\":\"accuracy\",\"type\":\"float\",\"doc\":\"accuracy of location (m)\"},{\"name\":\"speed\",\"type\":\"float\",\"doc\":\"speed over ground (m/s)\"},{\"name\":\"bearing\",\"type\":\"float\",\"doc\":\"the horizontal direction of travel of this device (degrees)\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  /** device timestamp in UTC (s) */
  @Deprecated public double time;
  /** device receiver timestamp in UTC (s) */
  @Deprecated public double timeReceived;
  /** 1-GPS, 2-Network, 3-Other */
  @Deprecated public int provider;
  /** from a random reference latitude */
  @Deprecated public double latitude;
  /** from a random reference longitude */
  @Deprecated public double longitude;
  /** height above the WGS 84 (m) */
  @Deprecated public float altitude;
  /** accuracy of location (m) */
  @Deprecated public float accuracy;
  /** speed over ground (m/s) */
  @Deprecated public float speed;
  /** the horizontal direction of travel of this device (degrees) */
  @Deprecated public float bearing;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public PhoneSensorLocation() {}

  /**
   * All-args constructor.
   */
  public PhoneSensorLocation(java.lang.Double time, java.lang.Double timeReceived, java.lang.Integer provider, java.lang.Double latitude, java.lang.Double longitude, java.lang.Float altitude, java.lang.Float accuracy, java.lang.Float speed, java.lang.Float bearing) {
    this.time = time;
    this.timeReceived = timeReceived;
    this.provider = provider;
    this.latitude = latitude;
    this.longitude = longitude;
    this.altitude = altitude;
    this.accuracy = accuracy;
    this.speed = speed;
    this.bearing = bearing;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return time;
    case 1: return timeReceived;
    case 2: return provider;
    case 3: return latitude;
    case 4: return longitude;
    case 5: return altitude;
    case 6: return accuracy;
    case 7: return speed;
    case 8: return bearing;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: time = (java.lang.Double)value$; break;
    case 1: timeReceived = (java.lang.Double)value$; break;
    case 2: provider = (java.lang.Integer)value$; break;
    case 3: latitude = (java.lang.Double)value$; break;
    case 4: longitude = (java.lang.Double)value$; break;
    case 5: altitude = (java.lang.Float)value$; break;
    case 6: accuracy = (java.lang.Float)value$; break;
    case 7: speed = (java.lang.Float)value$; break;
    case 8: bearing = (java.lang.Float)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'time' field.
   * device timestamp in UTC (s)   */
  public java.lang.Double getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * device timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTime(java.lang.Double value) {
    this.time = value;
  }

  /**
   * Gets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   */
  public java.lang.Double getTimeReceived() {
    return timeReceived;
  }

  /**
   * Sets the value of the 'timeReceived' field.
   * device receiver timestamp in UTC (s)   * @param value the value to set.
   */
  public void setTimeReceived(java.lang.Double value) {
    this.timeReceived = value;
  }

  /**
   * Gets the value of the 'provider' field.
   * 1-GPS, 2-Network, 3-Other   */
  public java.lang.Integer getProvider() {
    return provider;
  }

  /**
   * Sets the value of the 'provider' field.
   * 1-GPS, 2-Network, 3-Other   * @param value the value to set.
   */
  public void setProvider(java.lang.Integer value) {
    this.provider = value;
  }

  /**
   * Gets the value of the 'latitude' field.
   * from a random reference latitude   */
  public java.lang.Double getLatitude() {
    return latitude;
  }

  /**
   * Sets the value of the 'latitude' field.
   * from a random reference latitude   * @param value the value to set.
   */
  public void setLatitude(java.lang.Double value) {
    this.latitude = value;
  }

  /**
   * Gets the value of the 'longitude' field.
   * from a random reference longitude   */
  public java.lang.Double getLongitude() {
    return longitude;
  }

  /**
   * Sets the value of the 'longitude' field.
   * from a random reference longitude   * @param value the value to set.
   */
  public void setLongitude(java.lang.Double value) {
    this.longitude = value;
  }

  /**
   * Gets the value of the 'altitude' field.
   * height above the WGS 84 (m)   */
  public java.lang.Float getAltitude() {
    return altitude;
  }

  /**
   * Sets the value of the 'altitude' field.
   * height above the WGS 84 (m)   * @param value the value to set.
   */
  public void setAltitude(java.lang.Float value) {
    this.altitude = value;
  }

  /**
   * Gets the value of the 'accuracy' field.
   * accuracy of location (m)   */
  public java.lang.Float getAccuracy() {
    return accuracy;
  }

  /**
   * Sets the value of the 'accuracy' field.
   * accuracy of location (m)   * @param value the value to set.
   */
  public void setAccuracy(java.lang.Float value) {
    this.accuracy = value;
  }

  /**
   * Gets the value of the 'speed' field.
   * speed over ground (m/s)   */
  public java.lang.Float getSpeed() {
    return speed;
  }

  /**
   * Sets the value of the 'speed' field.
   * speed over ground (m/s)   * @param value the value to set.
   */
  public void setSpeed(java.lang.Float value) {
    this.speed = value;
  }

  /**
   * Gets the value of the 'bearing' field.
   * the horizontal direction of travel of this device (degrees)   */
  public java.lang.Float getBearing() {
    return bearing;
  }

  /**
   * Sets the value of the 'bearing' field.
   * the horizontal direction of travel of this device (degrees)   * @param value the value to set.
   */
  public void setBearing(java.lang.Float value) {
    this.bearing = value;
  }

  /** Creates a new PhoneSensorLocation RecordBuilder */
  public static org.radarcns.phoneSensors.PhoneSensorLocation.Builder newBuilder() {
    return new org.radarcns.phoneSensors.PhoneSensorLocation.Builder();
  }
  
  /** Creates a new PhoneSensorLocation RecordBuilder by copying an existing Builder */
  public static org.radarcns.phoneSensors.PhoneSensorLocation.Builder newBuilder(org.radarcns.phoneSensors.PhoneSensorLocation.Builder other) {
    return new org.radarcns.phoneSensors.PhoneSensorLocation.Builder(other);
  }
  
  /** Creates a new PhoneSensorLocation RecordBuilder by copying an existing PhoneSensorLocation instance */
  public static org.radarcns.phoneSensors.PhoneSensorLocation.Builder newBuilder(org.radarcns.phoneSensors.PhoneSensorLocation other) {
    return new org.radarcns.phoneSensors.PhoneSensorLocation.Builder(other);
  }
  
  /**
   * RecordBuilder for PhoneSensorLocation instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PhoneSensorLocation>
    implements org.apache.avro.data.RecordBuilder<PhoneSensorLocation> {

    private double time;
    private double timeReceived;
    private int provider;
    private double latitude;
    private double longitude;
    private float altitude;
    private float accuracy;
    private float speed;
    private float bearing;

    /** Creates a new Builder */
    private Builder() {
      super(org.radarcns.phoneSensors.PhoneSensorLocation.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(org.radarcns.phoneSensors.PhoneSensorLocation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.provider)) {
        this.provider = data().deepCopy(fields()[2].schema(), other.provider);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.latitude)) {
        this.latitude = data().deepCopy(fields()[3].schema(), other.latitude);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.longitude)) {
        this.longitude = data().deepCopy(fields()[4].schema(), other.longitude);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.altitude)) {
        this.altitude = data().deepCopy(fields()[5].schema(), other.altitude);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.accuracy)) {
        this.accuracy = data().deepCopy(fields()[6].schema(), other.accuracy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.speed)) {
        this.speed = data().deepCopy(fields()[7].schema(), other.speed);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.bearing)) {
        this.bearing = data().deepCopy(fields()[8].schema(), other.bearing);
        fieldSetFlags()[8] = true;
      }
    }
    
    /** Creates a Builder by copying an existing PhoneSensorLocation instance */
    private Builder(org.radarcns.phoneSensors.PhoneSensorLocation other) {
            super(org.radarcns.phoneSensors.PhoneSensorLocation.SCHEMA$);
      if (isValidValue(fields()[0], other.time)) {
        this.time = data().deepCopy(fields()[0].schema(), other.time);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.timeReceived)) {
        this.timeReceived = data().deepCopy(fields()[1].schema(), other.timeReceived);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.provider)) {
        this.provider = data().deepCopy(fields()[2].schema(), other.provider);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.latitude)) {
        this.latitude = data().deepCopy(fields()[3].schema(), other.latitude);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.longitude)) {
        this.longitude = data().deepCopy(fields()[4].schema(), other.longitude);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.altitude)) {
        this.altitude = data().deepCopy(fields()[5].schema(), other.altitude);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.accuracy)) {
        this.accuracy = data().deepCopy(fields()[6].schema(), other.accuracy);
        fieldSetFlags()[6] = true;
      }
      if (isValidValue(fields()[7], other.speed)) {
        this.speed = data().deepCopy(fields()[7].schema(), other.speed);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.bearing)) {
        this.bearing = data().deepCopy(fields()[8].schema(), other.bearing);
        fieldSetFlags()[8] = true;
      }
    }

    /** Gets the value of the 'time' field */
    public java.lang.Double getTime() {
      return time;
    }
    
    /** Sets the value of the 'time' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setTime(double value) {
      validate(fields()[0], value);
      this.time = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'time' field has been set */
    public boolean hasTime() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'time' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'timeReceived' field */
    public java.lang.Double getTimeReceived() {
      return timeReceived;
    }
    
    /** Sets the value of the 'timeReceived' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setTimeReceived(double value) {
      validate(fields()[1], value);
      this.timeReceived = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'timeReceived' field has been set */
    public boolean hasTimeReceived() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'timeReceived' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearTimeReceived() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'provider' field */
    public java.lang.Integer getProvider() {
      return provider;
    }
    
    /** Sets the value of the 'provider' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setProvider(int value) {
      validate(fields()[2], value);
      this.provider = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'provider' field has been set */
    public boolean hasProvider() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'provider' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearProvider() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /** Gets the value of the 'latitude' field */
    public java.lang.Double getLatitude() {
      return latitude;
    }
    
    /** Sets the value of the 'latitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setLatitude(double value) {
      validate(fields()[3], value);
      this.latitude = value;
      fieldSetFlags()[3] = true;
      return this; 
    }
    
    /** Checks whether the 'latitude' field has been set */
    public boolean hasLatitude() {
      return fieldSetFlags()[3];
    }
    
    /** Clears the value of the 'latitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearLatitude() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /** Gets the value of the 'longitude' field */
    public java.lang.Double getLongitude() {
      return longitude;
    }
    
    /** Sets the value of the 'longitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setLongitude(double value) {
      validate(fields()[4], value);
      this.longitude = value;
      fieldSetFlags()[4] = true;
      return this; 
    }
    
    /** Checks whether the 'longitude' field has been set */
    public boolean hasLongitude() {
      return fieldSetFlags()[4];
    }
    
    /** Clears the value of the 'longitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearLongitude() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /** Gets the value of the 'altitude' field */
    public java.lang.Float getAltitude() {
      return altitude;
    }
    
    /** Sets the value of the 'altitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setAltitude(float value) {
      validate(fields()[5], value);
      this.altitude = value;
      fieldSetFlags()[5] = true;
      return this; 
    }
    
    /** Checks whether the 'altitude' field has been set */
    public boolean hasAltitude() {
      return fieldSetFlags()[5];
    }
    
    /** Clears the value of the 'altitude' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearAltitude() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /** Gets the value of the 'accuracy' field */
    public java.lang.Float getAccuracy() {
      return accuracy;
    }
    
    /** Sets the value of the 'accuracy' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setAccuracy(float value) {
      validate(fields()[6], value);
      this.accuracy = value;
      fieldSetFlags()[6] = true;
      return this; 
    }
    
    /** Checks whether the 'accuracy' field has been set */
    public boolean hasAccuracy() {
      return fieldSetFlags()[6];
    }
    
    /** Clears the value of the 'accuracy' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearAccuracy() {
      fieldSetFlags()[6] = false;
      return this;
    }

    /** Gets the value of the 'speed' field */
    public java.lang.Float getSpeed() {
      return speed;
    }
    
    /** Sets the value of the 'speed' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setSpeed(float value) {
      validate(fields()[7], value);
      this.speed = value;
      fieldSetFlags()[7] = true;
      return this; 
    }
    
    /** Checks whether the 'speed' field has been set */
    public boolean hasSpeed() {
      return fieldSetFlags()[7];
    }
    
    /** Clears the value of the 'speed' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearSpeed() {
      fieldSetFlags()[7] = false;
      return this;
    }

    /** Gets the value of the 'bearing' field */
    public java.lang.Float getBearing() {
      return bearing;
    }
    
    /** Sets the value of the 'bearing' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder setBearing(float value) {
      validate(fields()[8], value);
      this.bearing = value;
      fieldSetFlags()[8] = true;
      return this; 
    }
    
    /** Checks whether the 'bearing' field has been set */
    public boolean hasBearing() {
      return fieldSetFlags()[8];
    }
    
    /** Clears the value of the 'bearing' field */
    public org.radarcns.phoneSensors.PhoneSensorLocation.Builder clearBearing() {
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    public PhoneSensorLocation build() {
      try {
        PhoneSensorLocation record = new PhoneSensorLocation();
        record.time = fieldSetFlags()[0] ? this.time : (java.lang.Double) defaultValue(fields()[0]);
        record.timeReceived = fieldSetFlags()[1] ? this.timeReceived : (java.lang.Double) defaultValue(fields()[1]);
        record.provider = fieldSetFlags()[2] ? this.provider : (java.lang.Integer) defaultValue(fields()[2]);
        record.latitude = fieldSetFlags()[3] ? this.latitude : (java.lang.Double) defaultValue(fields()[3]);
        record.longitude = fieldSetFlags()[4] ? this.longitude : (java.lang.Double) defaultValue(fields()[4]);
        record.altitude = fieldSetFlags()[5] ? this.altitude : (java.lang.Float) defaultValue(fields()[5]);
        record.accuracy = fieldSetFlags()[6] ? this.accuracy : (java.lang.Float) defaultValue(fields()[6]);
        record.speed = fieldSetFlags()[7] ? this.speed : (java.lang.Float) defaultValue(fields()[7]);
        record.bearing = fieldSetFlags()[8] ? this.bearing : (java.lang.Float) defaultValue(fields()[8]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}