public class ColorFon {
    //https://habr.com/ru/company/macloud/blog/558316/

    //RGB Color \033[38;2;255;0;255m
//              \033[38;2;⟨r⟩;⟨g⟩;⟨b⟩m — цвет текста
//              \033[48;2;⟨r⟩;⟨g⟩;⟨b⟩m — цвет фона
//              \033[48;2;255;0;255mColor text\u001B[0m
    static int colorRed = 0;
    static int colorGreen = 0;
    static int colorBlue = 0;

    static void colorFon() {
        while (true) {
            colorRedPlus();
            colorGreenPlus();
            colorBluePlus();
            colorRedMinus();
            colorGreenMinus();
            colorBlueMinus();
        }
    }

    static void colorRedPlus() {
        while (colorRed <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorRed++;
        }
    }

    static void colorGreenPlus() {
        while (colorGreen <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorGreen++;
        }
    }

    static void colorBluePlus() {
        while (colorBlue <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorBlue++;
        }
    }

    static void colorRedMinus() {
        while (colorRed <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorRed--;
        }
    }

    static void colorGreenMinus() {
        while (colorGreen <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorGreen--;
        }
    }

    static void colorBlueMinus() {
        while (colorBlue <= 255) {
            System.out.println("\033[48;2;" + colorRed + ";" + colorGreen + ";" + colorBlue + "m       " + "\u001B[0m");
            colorBlue--;
        }
    }
}