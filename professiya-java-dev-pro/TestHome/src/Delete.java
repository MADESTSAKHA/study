import java.util.HashMap;
import java.util.Map;

public class Delete {
    static void delete() {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("79142734433", "Соколов Владимир");
        phoneBook.put("79963164037", "Соколова Амелия");
        phoneBook.put("79141108880", "Соколова Екатерина");
        phoneBook.put("79969149409", "Готовцева Евдокия Дмитриевна");

        System.out.println(phoneBook);
        System.out.println(phoneBook.get("79142734433"));
        System.out.println(phoneBook.values());
        phoneBook.put("79142734433", "Новый папа Владимир");
        System.out.println(phoneBook.get("79142734433"));
        System.out.println(phoneBook.values());

    }
}