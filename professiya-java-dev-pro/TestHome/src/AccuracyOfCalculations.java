public class AccuracyOfCalculations {

    public static final double EPSILON = 0.000000001;

    /*
        Точность вычислений;

        Точность чисел "float"b "double"
        Сравнение чисел "float"b "double"
        Точность малых и больших чисел
    */
    static void accuracyOfCalculations() {

        double value = 24.0 * 0.1;
        System.out.println(value);
        // 2.4000000000000004

        float value2 = 0.3f + 0.4f;
        System.out.println(value2);
        // 0.70000005

        System.out.println("Число PI: " + Math.PI);
        System.out.println("Число PI, преобраз в float: " + (float) Math.PI);

        System.out.println("\n================\n");

        double value3 = 2.0 - 1.1;    //0.8999999999999999
        double value4 = 0.9;          //0.9
        System.out.println(value3);
        System.out.println(value4);
        boolean comparison = value3 == value4;
        System.out.println(comparison);  //false

        System.out.println("\n================\n");

        double value5 = 2.0 - 1.1;    //0.8999999999999999
        double value6 = 0.9;          //0.9
        System.out.println(value5);
        System.out.println(value6);
        boolean comparison2 = Math.abs(value5 - value6) < EPSILON; //Использован EPSILON
        System.out.println(comparison2);  //true

        System.out.println("\n================\n");

        long value7 = 100000000000000000L;
        double value8 = 100000000000000000.0;
        System.out.println(value7);
        System.out.println(value8);
    }
}