public class Bred {
    private String name;
    private int price;

    void buyBred() {
    }

    void buyBred(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void printBred() {
        System.out.println("Название: " + name + ", цена: " + price);
    }
}