package lighting;
public interface ElectricDevice {
    boolean isSwitchOn();
    void switchOn();
    void switchOff();

    default void toggle() {
        if (isSwitchOn()) {
            switchOff();
        } else {
            switchOn();
        }
    }

    double getEnergyConsumption();
}