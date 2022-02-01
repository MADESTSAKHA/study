public class Strings {      //Строки

    static void string() {
        Strings soap = new Strings("Мыло", 100);
        soap.productInfo(soap);
        Strings banya = new Strings("Баня", 150);
        soap.productInfo(banya);

        Strings mask = new Strings("Maska", 50);
        mask.string2(mask);

        Strings mask2 = new Strings("Валенки", 400);
        mask2.string3(mask2);

        Strings mask3 = new Strings("Носки", 110);
        mask3.string4(mask3);

        Strings compare = new Strings();
        compare.string5();
        System.out.println("========Первый способ проверить что строка пустая========\n");
        String name = "Дмитрий";
        String surname = "Петров";
        int age = 55;
        String empty = "";
        boolean isEmpty = empty.length() == 0;
        System.out.println(isEmpty + " - Проверка длинны boolean(Есть ли в тексте символы).");

        System.out.println("\n========Второй способ проверить что строка пустая========\n");
        System.out.println(empty.isEmpty() + " - Пустая строка .isEmpty().");

        System.out.println("\n========Третий способ проверить что строка пустая========\n");
        String blank = "   \t   \n   ";
        System.out.println(blank.isBlank() + " - Пустая строка .isBlank() - возвращающий TRUE\n" +
                "\tне только когда она пуста, но и тогда, когда \n" +
                "\tона состоит из пробелов или пробельных символов.");

        System.out.println("\n=========================================================");
        System.out.println("========Конкатенация строк========\n");
        // Объединение двух или более строк в одну

        String personInfo = name + " " + surname + " - " + age + " лет";
        System.out.println(personInfo);
        System.out.println("\n=====Конкатенация объекта со строкой=====\n");
    }

    private String name;
    private int price;
    private final int multiplier = 10_000;

    public Strings() {
    }

    public Strings(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }  // +3 символа!!!

    public String toString2() {
        return name.concat(" - ").concat(Integer.toString(price));
    }  // +3 символа!!!

    void productInfo(Strings info) {
        String productInfo = "Информация о продукте: " + info;
        System.out.println(productInfo);
    }

    void string2(Strings info) {
        System.out.println("\n=====Множественная конкатенация=====\n" +
                "\tкогда к строке нужно добавить множество новых строк\n");

        String goods = "";
        long start = System.currentTimeMillis();
        for (int i = 0; i < multiplier; i++) {
            goods += info + "\n";
        }
        System.out.println(System.currentTimeMillis() - start + " - время за которое выполнилось добавление строк");
        System.out.println(info.toString().length() + " - символов в слове");
        System.out.println(goods.length() + " - число символов в строчке");
    }

    void string3(Strings info) {
        System.out.println("\n=====Классический способ StringBuilder (.append)=====");

        StringBuilder goods2 = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < multiplier; i++) {
            goods2.append(info).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start + " - время за которое выполнилось добавление строк");
        System.out.println(info.toString().length() + " - символов в слове");
        System.out.println(goods2.length() + " - число символов в строчке");
    }

    void string4(Strings info) {
        System.out.println("\n=====Классический способ StringBuilder (.concat)=====");


        StringBuilder goods3 = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i = 0; i < multiplier; i++) {
            goods3.append(info).append("\n");
        }
        System.out.println(System.currentTimeMillis() - start + " - время за которое выполнилось добавление строк");
        System.out.println(info.toString2().length() + " - символов в слове");
        System.out.println(goods3.length() + " - число символов в строчке");
    }

    void string5() {
        System.out.println("\n=========================================================");
        System.out.println("========Сравнение строк========");
        System.out.println("Для сравнения строк, необходимо пользоваться только методом \".equals\"\n");

        String managerName = "Василий";
        String customerName = "Васи".concat("лий");
        System.out.println(managerName.equals(customerName));
    }
}