public class Main {
    public static void main(String[] args) {

        Basket vasyaBasket = new Basket(2000);
        vasyaBasket.add("Хлеб", 49,2);
        vasyaBasket.add("Масло", 105,3);
        vasyaBasket.add("Колбаса", 220);
        vasyaBasket.print("Корзина Васи: ");
        vasyaBasket.getTotalPrice();
        vasyaBasket.clear();
        vasyaBasket.print("Корзина Васи: ");
        vasyaBasket.getTotalPrice();

        Basket petyaBasket = new Basket();
        petyaBasket.add("Лопата", 500);
        petyaBasket.add("Фонарик", 1500);
        petyaBasket.print("Корзина Пети: ");
        petyaBasket.getTotalPrice();

        Basket mashaBasket = new Basket("Стол", 5000);
        mashaBasket.print("Корзина Маши: ");
        mashaBasket.getTotalPrice();
    }
}