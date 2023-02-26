import java.util.Arrays;

public class SortArrays {
    public static void sortArrays() {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                /*Сравниваем элементы попарно, если они имеют неправильный порядок,то меняем местами*/
                if (numbers[j] > numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------");
        int[] numbers2 = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};

        Arrays.sort(numbers2);

        System.out.println(Arrays.toString(numbers2));
    }
}