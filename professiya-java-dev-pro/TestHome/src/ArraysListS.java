import java.util.ArrayList;

public class ArraysListS {
    static void arraysListS() {
        System.out.println("===================Список дел #1==================");
        ArrayList<String> todoList = new ArrayList<>();

        todoList.add("Первое наше дело");
        todoList.add(0,"Второе дело");
        todoList.add("Следующее дело");

        for (int i = 0; i < todoList.size(); i++) {
            System.out.println(todoList.get(i));
        }

        System.out.println("===================Список дел #2==================");
        ArrayList<String> todoList2 = new ArrayList<>(){{
            add("Первое дело");
            add("Второе дело");
            add(0,"Еще одно дело");
        }};

        todoList2.add("Четвертое дело");
        todoList2.remove(1);

        for (String s : todoList2) {
            System.out.println(s);
        }
    }
}