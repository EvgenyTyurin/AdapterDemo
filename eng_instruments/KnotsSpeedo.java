package eng_instruments;

/**
 * Old fashioned speedometr made in England in 1960... (Adaptee role)
 */

public class KnotsSpeedo {

    private float knots;
    private String alarm;

    public KnotsSpeedo(float knots) {
        setKnots(knots);
    }

    public void  setKnots(float knots) {
        this.knots = knots;
        setAlarm();
    }

    public void setAlarm(){
        if (knots < 150)
            alarm = "Stall!";
        else
            alarm = "Normal";
    }

    public String getAlarm() {
        return alarm;
    }
}
