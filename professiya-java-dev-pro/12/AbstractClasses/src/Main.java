import java.util.ArrayList;
import java.util.List;

/*
    https://www.youtube.com/watch?v=6wmeylsb7v8&list=PLGYiCW-2OvbMIMbdy8Th_ScFugpredd9V&index=9&t=2s
 */

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        List<Employee> workers = new ArrayList<>();

        for (int i = 0; i < 180; i++) {
            company.hire(new Operator(30000));
        }

        for (int i = 0; i < 80; i++) {
            workers.add(new Manager(40000));
            if (i % 8 == 0) {
                workers.add(new TopManager(50000, company));
            }
        }
        company.hireAll(workers);

        printEmployees(company);
        System.out.println("Заработанные для компании денеги: " + company.getIncome());
        System.out.println("------------------=======================------------------");
        List<Employee> employees = company.getEmployees();
        int size = employees.size();
        System.out.println("Сотрудников работает: " + size);
        int fire = 0;
        for (int i = 0; i < size / 2; i++) {
            company.fire(employees.get(i));
            fire++;
        }
        System.out.println("\tУвоненно сотрудников: " + fire);
        System.out.println("Сотрудников работает: " + company.getEmployees().size());
        System.out.println("------------------=======================------------------");
        printEmployees(company);
        System.out.println("Заработанные для компании денеги: " + company.getIncome());
    }

    private static void printEmployees(Company company) {
        System.out.println("\n----Список из самых ВЫСоких зарплат в компании.----");
        List<Employee> topSalaryStaff = company.getTopSalaryStaff(10);
        int i = 1;
        for (Employee e : topSalaryStaff) {
            System.out.println(i + ") " + e.getMonthSalary());
            i++;
        }
        System.out.println("\n----Список из самых НИЗких зарплат в компании.----");
        List<Employee> lowSalaryStaff = company.getLowestSalaryStaff(30);
        int j = 1;
        for (Employee e : lowSalaryStaff) {
            System.out.println(j + ") " + e.getMonthSalary());
            j++;
        }
        System.out.println("--------------------");
    }
}