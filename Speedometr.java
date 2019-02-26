import eng_instruments.KnotsSpeedo;

/**
 * Standard speedometr that uses knots-speedo (Adapter role)
 */

class Speedometr extends FlightInstr{
    private KnotsSpeedo knotsSpeedo;

    Speedometr(float paramValue) {
        super(paramValue);
        knotsSpeedo = new KnotsSpeedo(paramValue);
    }

    @Override
    void setParamValue(float paramValue) {
        super.setParamValue(paramValue);
        if (knotsSpeedo != null) {
            knotsSpeedo.setKnots(0.7f * paramValue);
        }
    }

    @Override
    void setAlarmStatus() {
        if (knotsSpeedo != null) {
            knotsSpeedo.setAlarm();
            alarmStatus = knotsSpeedo.getAlarm().equals("Stall!");
        }
    }
}
