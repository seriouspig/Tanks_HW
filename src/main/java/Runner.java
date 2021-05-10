import java.text.DecimalFormat;

public class Runner {

    public static void main(String[] args) {

        Tank tank1;
        Catapult catapult1;

        tank1 = new Tank(30,"Tiger I");
        catapult1 = new Catapult(20, 15);

        DecimalFormat df = new DecimalFormat(".00");

        System.out.println("The projectile shot by " + tank1.getModel()
                + " travelled " + df.format(tank1.shoot(40))
                + " meters");

        System.out.println("The projectile took " + catapult1.getLoadingTime()
                + " seconds to load and travelled " + df.format(catapult1.shoot(20))
                + " meters");
    }
}
