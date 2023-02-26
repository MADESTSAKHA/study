package lighting;
public class Chandelier extends LightingDevice {
    public static final double LAMP_BRIGHTNESS_STEPS = 2; //ЯРКОСТЬ ЛАМПЫ
    public static final double CONSUMPTION_COEFFICIENT = 1.095; //КОЭФФИЦИЕНТ ПОТРЕБЛЕНИЯ
    private final int lampCount;

    public Chandelier(int power, int lampCount) {
        super(power);
        this.lampCount = lampCount;
    }

    @Override
    public void setBrightness(double level) {
        double step = 1.0 / (lampCount * LAMP_BRIGHTNESS_STEPS);
        int stepsCount = (int) Math.round(level / step);
        super.setBrightness(stepsCount * step);
        class Controller {
            public Controller() {
                //Connect
            }
            public void reset() {
                //some logic
            }
        }
        if (brightness == 0) {
            Controller controller = new Controller();
            controller.reset();
        }
    }

    @Override
    public double getEnergyConsumption() {
        return power * Math.pow(brightness, CONSUMPTION_COEFFICIENT);
    }
}