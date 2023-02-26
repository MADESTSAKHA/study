public class Main {
    public static void main(String[] args) {

        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(20, 5);
        arithmeticCalculator.calculator(Operation.ADD);
        arithmeticCalculator.calculator(Operation.SUBTRACT);
        arithmeticCalculator.calculator(Operation.MULTIPLY);
    }
}