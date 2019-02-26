/**
 * Flight instrument standard
 */

abstract class FlightInstr {
    float paramValue = 0;
    boolean alarmStatus;

    FlightInstr(float paramValue) {
        setParamValue(paramValue);
    }

    void setParamValue(float paramValue) {
      this.paramValue = paramValue;
      setAlarmStatus();
    }

    boolean isAlarm() {
        return alarmStatus;
    }

    abstract void setAlarmStatus();
}
