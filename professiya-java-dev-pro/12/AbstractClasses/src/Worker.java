public abstract class Worker implements Employee {
    protected final int salary;

    public Worker(int salary) {
        this.salary = (int) ((Math.random() * salary) + salary);                                     //заработная оплата
    }

    @Override
    public int getMonthSalary() {
        return salary;
    }
}
