public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket("Товары", 176000);
        Session session = new Session();

        System.out.println(Basket.getBasketCount());
        basket.increaseCount(10);
        System.out.println(Basket.getBasketCount());

        DelivryOrder delivryOrder = new DelivryOrder(DeliveryType.PEDESTRIAN, Fragile.NO, Cold.YES);

    }
}