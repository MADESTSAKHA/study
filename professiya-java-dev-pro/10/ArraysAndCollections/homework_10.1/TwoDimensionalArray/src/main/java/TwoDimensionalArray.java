public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        //TODO: Написать метод, который создаст двумерный массив char заданного размера.
        // массив должен содержать символ symbol по диагоналям, пример для size = 3
        // [X,  , X]
        // [ , X,  ]
        // [X,  , X]

        char[][] arr = new char[size][size];

        // version #56
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; size = arr[i].length, j++, size--) {
//                if (i == j || i == size - j) {
//                    arr[i][j] = symbol;
//                    System.out.print(arr[i][j]);
//                } else {
//                    arr[i][j] = 0;
//                    System.out.print(' ');
//                }
//            }
//            System.out.println();
//        }

        // version #57 8o) work!
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
//                if (i == j || i == x) arr[i][j] = symbol;
//                else arr[i][j] = ' ';
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();  //System.lineSeparator();  //System.out.print("\n");  //System.out.println(" ");
//        }

        // version #58 8o) work!
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == (size - 1)) {
                    arr[i][j] = symbol;
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        return arr;
    }
}