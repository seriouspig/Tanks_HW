public class Catapult extends Launcher{

    private double loadingTime;

    public Catapult(double velocity, double loadingTime) {
        super(velocity);
        this.loadingTime = loadingTime;
    }

    public double getLoadingTime() {
        return loadingTime;
    }

    public void setLoadingTime(double loadingTime) {
        this.loadingTime = loadingTime;
    }
}
