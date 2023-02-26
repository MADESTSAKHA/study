public interface Employee extends Comparable<Employee> {                                                                // Сотрудник
    int getMonthSalary();                                                                                               // Получить месячную зарплату
    default void setCompany(Company company) {
    }
    @Override
    default int compareTo(Employee o) {
        return getMonthSalary() - o.getMonthSalary();
    }
}
