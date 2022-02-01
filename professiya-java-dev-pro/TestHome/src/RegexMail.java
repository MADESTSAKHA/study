import java.util.regex.Matcher;
import java.util.regex.Pattern;

// TODO: https://regex101.com/

public class RegexMail {
    public static void regexMail() {
        final String regex = "^[\\w_-]+@{1,1}[\\w]+\\.{1,1}[\\w$]+";
        final String string = "madestsakha@gmail.com\n"
                + "mades.t_sa-kha@gma.il.com\n"
                + "mao16sakha@gmail.com\n"
                + "mao16_sakha@gmail.com\n"
                + "mao16_-sakha@gmail.com\n"
                + "mao16sakha@gmail.ru\n"
                + "madestsakha_gmail.com\n"
                + "madestsakha@gmail.com\n"
                + "mao16sakha@gmail.ru\n"
                + "madestsakha@gmailcom\n"
                + "madest123sakha@gma123il.com\n"
                + "madestsakha@gma@il_com\n"
                + "mades.t_sa-kha@gma.il.com";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));

            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
