import java.util.*;

public class Company {
    private final List<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {                                   //найм одного сотрудника.
        employee.setCompany(this);
        employees.add(employee);
    }

    public void hireAll(List<Employee> employees) {                         //найм списка сотрудников.
        for (Employee e : employees) {
            hire(e);
        }
    }

    public void fire(Employee employee) {                                   //увольнение сотрудника.
        employee.setCompany(null);
        employees.remove(employee);
    }

    public int getIncome() {                                                //получение значения дохода компании.
        int inCome = 0;
        for (Employee e : employees) {
            if (e instanceof Manager) {
                inCome += ((Manager) e).getSales();
            }
        }
        return inCome;
    }

    public List<Employee> getTopSalaryStaff(int count) {                 //получить список ВЫСокооплачиваемого персонала
        return getList(count, Comparator.reverseOrder());
    }

    public List<Employee> getLowestSalaryStaff(int count) {              //получить список НИЗкооплачиваемого персонала
        return getList(count, Comparator.naturalOrder());
    }

    private List<Employee> getList(int count, Comparator<Employee> cmp) {
        if (count <= 0) {
            System.out.println("Передано неверное значение!");
            return Collections.emptyList();                               //new ArrayList<>()
        }
        employees.sort(cmp);
        return new ArrayList<>(employees.subList(0, count));
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
