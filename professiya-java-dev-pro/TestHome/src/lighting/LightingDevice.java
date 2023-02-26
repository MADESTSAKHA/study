package lighting;
public abstract class LightingDevice implements ElectricDevice, Comparable {
    public static final double MAX_BRIGHTNESS = 1D;
    public static final double MIN_BRIGHTNESS = 0D;
    protected final int power;
    protected double brightness;

    public LightingDevice(int power) {
        this.power = power;
    }

    @Override
    public boolean isSwitchOn() {
        return brightness > 0;
    }

    @Override
    public void switchOn() {
        setBrightness(MAX_BRIGHTNESS);
    }

    @Override
    public void switchOff() {
        setBrightness(MIN_BRIGHTNESS);
    }

    public void setBrightness(double level) {
        if (level < MIN_BRIGHTNESS) {
            brightness = MIN_BRIGHTNESS;
        } else if (level > MAX_BRIGHTNESS) {
            brightness = MAX_BRIGHTNESS;
        } else {
            brightness = level;
        }
    }

    public double getBrightness() {
        return brightness;
    }

    public int getPower() {
        return power;
    }

    public void changeBrightness(double rate) {
        double change = brightness + brightness * rate;
        setBrightness(change);
    }

    @Override
    public int compareTo(Object o) {
        LightingDevice device = (LightingDevice) o;
        return Integer.compare(power, device.power);
    }

    @Override
    public String toString() {
        return getClass().getName() + " with power: " + power;
    }
}