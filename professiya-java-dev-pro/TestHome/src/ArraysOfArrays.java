public class ArraysOfArrays {
    //Массивы массивов
    static void arraysOfArrays() {
        System.out.println("========Массивы примитивов========\n");

        boolean[] array = new boolean[5];
        System.out.println(array[0]);

        try {
            String[] array2 = new String[5];
            System.out.println(array2[0].length());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n========Массивы массивов чисел========\n");

        int[][] studentsMarks = {
                {4, 5, 1, 2, 4},
                {3, 4, 2, 4, 5, 2, 2, 3},
                {2, 3, 4, 5},
                {3, 5, 3, 2, 2, 2, 3}
        };
        for (int i = 0; i < studentsMarks.length; i++) {                    //цикл по классам
            System.out.println("Класс# " + (i + 1) +
                    " (" + studentsMarks[i].length + " студентов):");
            for (int j = 0; j < studentsMarks[i].length; j++) {             //цикл по оценкам
                System.out.println("\t"+ "оценка: " + studentsMarks[i][j]);
            }
        }
    }
}