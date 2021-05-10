public class Tank extends Launcher{

    private double speed;
    private String model;

    public Tank(double velocity, String model) {
        super (velocity);
        this.speed = speed;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
