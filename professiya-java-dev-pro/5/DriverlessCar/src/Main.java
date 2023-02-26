import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        GearBox spacio = new GearBox(GearBoxType.AUTOMATIC);
        GearBox volga = new GearBox(GearBoxType.MANUAL);
        System.out.println(GearBox.MIN_GEAR); // - КОНСТАНТЫ
        System.out.println(GearBox.MAX_GEAR); // - КОНСТАНТЫ
        System.out.println(spacio.getType());
        System.out.println(spacio.type);
        System.out.println(volga.type);


    }
}