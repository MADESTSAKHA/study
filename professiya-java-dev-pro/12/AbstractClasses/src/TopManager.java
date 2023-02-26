public class TopManager extends Worker {
    /*
          TopManager — зарплата складывается из фиксированной части и бонуса в виде 150%
          от заработной платы, если доход компании более 10 млн рублей.
    */
    public static final double MULTIPLIER = 1.5;
    public static final int MIN_INCOME = 10_000_00;


    private Company company;

    public TopManager(int salary, Company company) {
        super(salary);
        setCompany(company);
    }

    @Override
    public int getMonthSalary() {
//        int salary = super.getMonthSalary();a
        if (company.getIncome() > MIN_INCOME)
            return (int) (salary + salary * MULTIPLIER);
        return salary;
    }

    @Override
    public void setCompany(Company company) {
        this.company = company;
    }
}