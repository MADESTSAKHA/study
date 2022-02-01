public class Main {
    public static void main(String[] args) {
        BankDetails details = new BankDetails(
                "ПАО СБЕРБАНК",
                "40817810176020024156",
                "30101810400000000609",
                "049805609",
                "Якутск");

        Company company = new Company("ЯКУТСКОЕ ОТДЕЛЕНИЕ N8603 ПАО СБЕРБАНК", details);
        System.out.println(company);
        System.out.println("---------------------------------------------------------------------");
        company.bankDetails().setBankName("Рога и копыта");
        System.out.println(company);
    }
}

// 40817810176020024156 - Зарплатная
// 049805609 - БИГ
// ЯКУТСКОЕ ОТДЕЛЕНИЕ N8603 ПАО СБЕРБАНК - название
// 30101810400000000609 - корр.счет

// 40817810276002063983 - вклад