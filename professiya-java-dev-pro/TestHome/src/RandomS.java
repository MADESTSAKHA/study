import java.util.Random;
import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class RandomS {
    static void randomS() {
        Random rnd = new Random();
        int number = rnd.nextInt(6) + 1;
        System.out.println("Random number: " + number);

        int random_number = 1 + (int) (Math.random() * 6);
        System.out.println("Value: " + random_number);

        // В многопоточных приложениях лучше использовать класс ThreadLocalRandom.
        int rand = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println("Value: " + rand);

        new Random().ints(10, 1, 7).forEach(System.out::println);

        new SplittableRandom().ints(10, 1, 7).forEach(n -> System.out.println(n));
    }
}
