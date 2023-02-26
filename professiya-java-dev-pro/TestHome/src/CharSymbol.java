public class CharSymbol {
            //Символ символа
    void charSymbol() {
        for (int i = 0; i < 65535; i++) {
            char c = (char) i;
            System.out.println(c + " - " + i);
        }
        char Yo1 = 'Ё';
        System.out.println(Yo1 + " - " + (int) Yo1);
        char Yo2 = 'ё';
        System.out.println(Yo2 + " - " + (int) Yo2);
    }
}