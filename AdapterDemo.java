/**
 *  Adapter pattern demo
 *  Feb 2019 Evgeny Tyrin
 *
 *  We have standard instruments (altimetr) with alarm system (yes/no)
 *  and old fashioned knot-speedometr with voice alarm (stall/normal)
 *  Speedometr class is an adapter for using knots-speedo in our
 *  autoland system
 */

public class AdapterDemo {
    public static void main(String[] args) {
        // Cruise flight
        float speed = 800;
        float altitude = 10000;
        // Slow down
        Speedometr speedometr = new Speedometr(speed);
        while (!speedometr.isAlarm()) {
            speed -= 10;
            speedometr.setParamValue(speed);
            System.out.println("Speed: " + speed);
        }
        // Descent
        Altimetr altimetr = new Altimetr(altitude);
        while (!altimetr.isAlarm()) {
            altitude -= 100;
            altimetr.setParamValue(altitude);
            System.out.println("Altitude: " + altitude);
        }
        System.out.println("Ready to land");
    }
}
