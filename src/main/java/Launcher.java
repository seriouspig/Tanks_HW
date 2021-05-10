import java.text.DecimalFormat;

public class Launcher {

    private double velocity;
    private static final double gravity = 9.8;

    public Launcher(double velocity) {
        this.velocity = velocity;
    }

    public double shoot(double angle) {
        double range = Math.pow(this.velocity, 2) * Math.sin(angle) / gravity;
        return range;
    }
}
