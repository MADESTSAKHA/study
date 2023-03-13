import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";
    public static final int SALARYINCREASE = 10000;

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
//        System.out.println(staff);
//        System.out.println("\t\t\t");
//        sortBySalaryAndAlphabet(staff);
        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
//        System.out.println("\t\t\t");
//        System.out.println(staff);
//        System.out.println("\t\t\t");
//        staff.stream().filter(e -> e.getSalary() >= (SALARYINCREASE * 10)).forEach(System.out::println);
//        System.out.println("\t\t\t");
//        Integer[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        Arrays.stream(number).forEach(System.out::println);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.

        staff.sort((o1, o2) -> {
            int found = o1.getSalary().compareTo(o2.getSalary());
            if (found == 0) {
                return o1.getName().compareTo(o2.getName());
            }
            return found;
        });

        for (int i = 0; i < staff.size(); i++) {
            System.out.println(staff.get(i));
        }
        System.out.println("----------**********----------");
        for (Employee employee : staff) {
            System.out.println(employee);
        }
        System.out.println("----------***** Old salaries *****----------");
        staff.forEach(System.out::println);
        System.out.println("----------***** New salaries *****----------");
        staff.forEach(e -> e.setSalary(e.getSalary() + SALARYINCREASE));           // Добавление зарплаты
        staff.forEach(System.out::println);
    }
}