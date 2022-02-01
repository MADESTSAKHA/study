import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SymbolsAndEncodings {
            //Символы и кодировки
            static void symbolsAndEncodings() {
        System.out.println("========Проверка символа, является ли он цифрой========");
        String line = "456456456A";
        char symbolFirst = line.charAt(0); //ПЕРВЫЙ символ в тексте
        char symbolLast = line.charAt(9); //ПОСЛЕДНИЙ символ в тексте
        System.out.println(line + " - Текст (символы)");
        System.out.println(symbolFirst + " - Вывод ПЕРВОГО символа");
        System.out.println(Character.isDigit(symbolFirst) + " - Проверка ПЕРВОГО символа, является ли он цифрой");
        System.out.println(symbolLast + " - Вывод ПОСЛЕДНЕГО символа");
        System.out.println(Character.isDigit(symbolLast) + " - Проверка ПОСЛЕДНЕГО символа, является ли он цифрой");

        System.out.println("\n========Подсчет пробелов (символа пробела: ' ')========");
        String text = "Заметки о приключения Шерлока Холмса и Доктора Ватсона в пригородах Лондона";
        int spaceCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (symbol == ' ') {
                spaceCount++;
            }
        }
        System.out.println(text + " - Исходный текст");
        System.out.println("Количество символов ПРОБЕЛА: " + spaceCount);
        System.out.println(text.replaceAll(" ", "") + " - Исходный текст c УДАЛЕННЫМИ ПРОБЕЛАМИ ВО ВЕЗДЕ");

        System.out.println("\n========Удаление символа ПРОБЕЛА по краям текста========");
        String name = " \t\n\n Aндриана  \t\n\r ";
        System.out.println(name);
        System.out.println(name.trim() + " - с удаленными пробелами и прочими отступами");

        System.out.println("\n=================Кодировка по умолчанию=================");
        String charSet = Charset.defaultCharset().displayName();
        System.out.println(charSet + " - Кодировка Windows11 по умолчанию");

        String text2 = "something about кодировки";
        String encodedText = new String(text2.getBytes(), StandardCharsets.US_ASCII); //(text2.getBytes(StandardCharsets.US_ASCII)
        System.out.println(encodedText + " - Установлена кодировка: StandardCharsets.US_ASCII");

        String encodedText2 = null;
        try {
            encodedText2 = new String(text2.getBytes(), "windows-1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(encodedText2 + " - Установлена кодировка: windows-1251");
    }
}
