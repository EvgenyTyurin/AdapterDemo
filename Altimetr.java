/**
 * Standard altimetr
 */

class Altimetr extends FlightInstr {

    Altimetr(float paramValue) {
        super(paramValue);
    }

    @Override
    void setAlarmStatus() {
        alarmStatus = paramValue < 500;
    }

}
