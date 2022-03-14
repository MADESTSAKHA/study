import java.util.*;

public class Delete {
    static void delete() {
        MultiMap<String, String> phoneBook = new MultiMap<>();


        // !          --= KEY =--        --=VALUE=--
        phoneBook.put("79142734433", "Соколов Владимир");
        phoneBook.put("79963164037", "Соколова Амелия");
        phoneBook.put("79141108880", "Соколова Екатерина");
        phoneBook.put("79969149409", "Готовцева Евдокия Дмитриевна");

        phoneBook.put("79142734433", "Новый папа Вован");

        System.out.println(phoneBook);                                   // ! Выдаёт: {79969149409=Готовцева, и тд и пт}
        System.out.println(phoneBook.map.entrySet());                        // ! Выдаёт: [79969149409=Готовцева, и тд и пт]
        System.out.println(phoneBook.map.keySet());                          // ! Выдает множество ключей (KEY)
        System.out.println(phoneBook.map.values());                          // ! Выдает множество значений (VALUE)
        System.out.println(phoneBook.get("79142734433"));                // ! Выдаёт значение (VALUE): Соколов Владимир
        System.out.println(phoneBook.map.containsKey("79969149409"));        // * Поиск в ключе (KEY)
        System.out.println(phoneBook.map.containsValue("Соколов Владимир")); // * Поиск в значении (VALUE)

        System.out.println("ЕсТче" + phoneBook.map.get("79142734433"));

//        for (Map.Entry<String, String> item : phoneBook.entrySet()) {
//            System.out.println("\t\tКлюч: " + item.getKey() + " Значение: " + item.getValue());
//        }
    }

    static class MultiMap<K, V> {
        private final Map<K, Collection<V>> map = new HashMap<>();

        public Collection<V> get(K key) {
            return map.getOrDefault(key, Collections.<V>emptyList());
        }

        public void put(K key, V value) {
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
        }
    }
}