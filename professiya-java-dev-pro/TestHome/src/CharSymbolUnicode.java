public class CharSymbolUnicode {
            //Символ Unicode
            static void charSymbolUnicode() {

        System.out.println("========Алфавит========\n");
        for (char i = 'А'; i <= 'я'; i++) {
            System.out.println(i + " - " + (int) i);
        }

        System.out.println("\n================\n");
        for (char i = '\u0000'; i <= '\u044f'; i++) {
            System.out.println(i + " - " + (int) i);
        }

//        https://unicode-table.com/ru/blocks/
        System.out.println("================\n");
        String myString = "Hello World";
        StringBuilder prContentFormatHex = new StringBuilder();
        for (char c : myString.toCharArray()) {
            prContentFormatHex.append(String.format("\\u" + "%04X", (int) c) + " - " + c + "\n");
        }
        System.out.println(prContentFormatHex);

        System.out.println("================\n");
        System.out.println("\u0048\u0065\u006c\u006c\u006f\u0020\u0057\u006f\u0072\u006c\u0064");
    }
}

/*
    String myString = "Hello World";
    String prContentFormatHex = "";
    for (char c : myString.toCharArray()) {
        prContentFormatHex += String.format("%04X ", (int) c);
    }
*/