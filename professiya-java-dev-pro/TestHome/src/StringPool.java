public class StringPool {
            //Пул строк
            static void stringPool() {
        String name1 = "Алексей";
        String name2 = new String("Алексей").intern();
        System.out.println(name1.equals(name2) + " - .intern() создаёт ссылку в пуле!");
    }
}