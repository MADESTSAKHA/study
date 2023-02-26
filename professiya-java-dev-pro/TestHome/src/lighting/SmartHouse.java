package lighting;

import java.util.ArrayList;

public class SmartHouse {
    private ArrayList<ElectricDevice> devices;

    public SmartHouse() {
        devices = new ArrayList<>();
        initLightingDevice();
    }

    public void switchOffAllDevice() {
        for (ElectricDevice device : devices) {
            device.switchOff();
        }
    }

    public double getEnergyConsumption() {
        double sum = 0;
        for (ElectricDevice device : devices) {
            sum += device.getEnergyConsumption();
        }
        return sum;
    }

    public void switchOffAllLight() {
        for (ElectricDevice device : devices) {
            if (device instanceof LightingDevice) {
                device.switchOff();
            }
        }
    }

    private void initLightingDevice() {
        devices.add(new Lamp(100));
        devices.add(new Lamp(60));
        devices.add(new Lamp(40));
        devices.add(new Chandelier(100, 4));
        devices.add(new Chandelier(400, 10));
        devices.add(new Chandelier(100, 4));
        devices.add(new Chandelier(120, 3));
    }
}
