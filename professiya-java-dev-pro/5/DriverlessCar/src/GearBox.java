public class GearBox {

    public static final int MIN_GEAR = 1; // - КОНСТАНТЫ
    public static final int MAX_GEAR = 6; // - КОНСТАНТЫ
    public int gear = 0;

    public final GearBoxType type;

    public GearBox(GearBoxType type) {
        this.type = type;
    }

    public GearBoxType getType() {
        return type;
    }

    public void shiftUp() {
        gear = gear < MAX_GEAR ? gear + 1 : gear;
    }

    public void shiftDown() {
        gear = gear > MIN_GEAR ? gear - 1 : gear;
    }

    public void switchRear() {
        if (gear > 1) {
            System.out.println("Со " + gear + "-ой скорости, нельзя переключиться на заднюю скорость!");
        } else {
            gear = gear -1;
        }
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }
}