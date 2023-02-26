import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
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

        for (Employee employee : staff) {
            System.out.println(employee);
        }
    }
}