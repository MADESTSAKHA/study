public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        for (char i = 'А'; i <= 'я'; ++i) {
            System.out.println(i + " - " + (int) i);
        }

        char yoBig = 'Ё';
        System.out.println(yoBig + " - " + (int) yoBig);
        char yoSmall = 'ё';
        System.out.println(yoSmall + " - " + (int) yoSmall);
    }
}