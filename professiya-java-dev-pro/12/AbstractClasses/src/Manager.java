import java.util.concurrent.ThreadLocalRandom;

public class Manager extends Worker {

    /*
           Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
           Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
    */
    private final int sales = ThreadLocalRandom.current().nextInt(115000, 140000);
    public static final double MULTIPLIER = 0.05;
//    private int sales = (int) (Math.random() * (140000 - 115000) + 115000);

    public Manager(int salary) {
        super(salary);
    }

    @Override
    public int getMonthSalary() {
        return (int) (salary + MULTIPLIER * sales);
    }

    public int getSales() {
        return sales;
    }
}