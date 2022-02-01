import java.math.BigDecimal;
import java.math.BigInteger;

public class LargeAndPreciseNumbers {
    //Работа с большими и точными числами

    static void bigInteger() {  // Целочисленные значения произвольной длины
        System.out.println("========bigInteger========\n");
        BigInteger integer = new BigInteger("12345678912345678912");
        BigInteger integer2 = new BigInteger("12345678912345678913");

//        integer = integer.add(integer);       // Прибавление
//        integer = integer.subtract(integer);  // Вычитание
//        integer = integer.multiply(integer);  // Умножение
//        integer = integer.divide(integer);    // Деление
//        integer = integer.remainder(new BigInteger("12345678912345678900"));   // Остаток от деления = 12
//        System.out.println("Сравнение: " + integer.compareTo(integer2)); // Сраснение
        System.out.println(integer);

        switch (integer.compareTo(integer2)) {  // Сраснение
            case (-1):
                System.out.println("Меньше");
                break;
            case (0):
                System.out.println("Равно");
                break;
            default:
                System.out.println("Больше");
                break;
        }
        System.out.println(integer.compareTo(integer2));  // Сраснение
    }

    static void bigDecimal() {  //  Числа с плавающей точкой
        System.out.println("\n========bigDecimal========\n");
        BigDecimal decimal = new BigDecimal("1");
        System.out.println(decimal.divide(new BigDecimal("4")));  // Деление
    }
}