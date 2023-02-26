public class Main {
    public static void main(String[] args) {
        int vasyaAge = 30;
        int katyaAge = 22;
        int mishaAge = 26;

        int min = -1;
        int middle = -1;
        int max = -1;

// Первый блок
        if (vasyaAge < katyaAge && vasyaAge < mishaAge)
        {
            min = vasyaAge;
            if (katyaAge < mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        }
        // Второй блок
        if (katyaAge < vasyaAge && katyaAge < mishaAge)
        {
            min = katyaAge;
            if (vasyaAge < mishaAge) {
                middle = vasyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = vasyaAge;
            }
        }
        // Третий блок
        if (mishaAge < vasyaAge && mishaAge < katyaAge)
        {
            min = mishaAge;
            if (vasyaAge < katyaAge) {
                middle = vasyaAge;
                max = katyaAge;
            } else {
                middle = katyaAge;
                max = vasyaAge;
            }
        }
        System.out.println("\n====================================================");
        System.out.println("\nВозраст по возрастанию : (Тавтология 8о)\n" + "\n\tMinimal age: " + min + "\n\tMiddle age: " + middle + "\n\tMaximum age: " + max );
        System.out.println("\n====================================================");
    }
}
