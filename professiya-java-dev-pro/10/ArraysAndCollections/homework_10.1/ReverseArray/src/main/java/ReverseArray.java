public class ReverseArray {

    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {

        String rainBow = "";
        for (int i = 0; i < strings.length / 2; i++) {
            rainBow = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = String.valueOf(rainBow);
        }
        return strings;
    }
}
