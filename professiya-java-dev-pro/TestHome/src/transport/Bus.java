package transport;

public class Bus {

    private double tankFullnessRate;
    protected double consumptionRate;

    private static int count;

    public Bus(double consumptionRate) {
        this.consumptionRate = consumptionRate;
        count++;
    }

    public boolean run(int distance) {
        if (powerReserve() < distance) {
            return false;
        }
        tankFullnessRate -= distance * consumptionRate;
        return true;
    }

    public void refuel(double tankRate) {
        double total = tankFullnessRate + tankRate;
        tankFullnessRate = total > 1 ? 1 : total;
    }

    int powerReserve() {
        return (int) (tankFullnessRate / consumptionRate);
    }

    public static int getCount() {
        return count;
    }

    public double getConsumptionRate() {
        return consumptionRate;
    }

    public double getTankFullnessRate() {
        return tankFullnessRate;
    }

}
