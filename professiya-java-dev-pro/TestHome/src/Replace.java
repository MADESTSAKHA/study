public class Replace {
    public static void replace() {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int index = path.indexOf("jdk");
        int index2 = path.indexOf("/", index);
        return path.replace(path.substring(index, index2), jdk);
    }
}

