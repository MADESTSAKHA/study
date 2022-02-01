public class Basket {

    String ANSI_RESET = "\u001B[0m";
    String ANSI_RED = "\u001B[31m";
    String ANSI_GREEN = "\u001B[32m";
    String ANSI_YELLOW = "\u001B[33m";
    String ANSI_PURPLE = "\u001B[35m";

    private String items = "";
    private int totalPrice = 0;
    private int limit;
    public boolean  isMore;

    public Basket() {
        items = "Список товаров: \n";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        if (contains(name) || totalPrice + count * price >= limit) {
            return;
        }
        isMore = count > 1;
        String special = isMore ? ANSI_PURPLE + " [1 шт. - " + price + " рублей]" + ANSI_RESET : "";
        items = items + name + " - " + count + " шт. - " +
                ANSI_YELLOW + count * price + ANSI_RESET + " рублей" + special +"\n";
        totalPrice = totalPrice + count * price;
    }

    public void clear() {
        items = "";
        totalPrice = 0;
        System.out.println("Корзина была очищена!");
    }

    public void getTotalPrice() {
        System.out.println("Общая сумма: " + totalPrice + "\n");
    }

    public boolean contains(String name) {
        return (items.contains(name));
    }

    public void print(String title) {
        System.out.print(ANSI_GREEN + title + ANSI_RESET + "\n");
        if (items.isEmpty()) {
            System.out.println(ANSI_RED + "Ваша корзина еще пуста" + ANSI_RESET);
        } else {
            System.out.println(items);
        }
    }
}