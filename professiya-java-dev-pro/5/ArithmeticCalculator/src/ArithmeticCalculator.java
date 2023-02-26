public class ArithmeticCalculator {

    public int number1;
    public int number2;

    public ArithmeticCalculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void calculator(Operation operation) {
        switch (operation) {
            case ADD:
                System.out.println("Числа: " + number1 + " + " + number2 + " ответ: " + (number1 + number2));
            case SUBTRACT:
                System.out.println("Числа: " + number1 + " - " + number2 + " ответ: " + (number1 - number2));
            case MULTIPLY:
                System.out.println("Числа: " + number1 + " * " + number2 + " ответ: " + (number1 * number2));
        }
    }
}