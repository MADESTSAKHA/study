package practice;

public class DepositAccount extends BankAccount {
<<<<<<< HEAD
    protected LocalDate lastIncome;                                               // Дата последнего пополнения

    @Override
    public void put(double amountToPut) {
        lastIncome = LocalDate.now();                                                   // Создание даты последнего пополнения
        super.put(amountToPut);
    }

    @Override
    public void take(double amountToTake) {
        if (!LocalDate.now().isBefore(lastIncome.plusMonths(1))) {
            super.take(amountToTake);
        } else {
            System.out.println("Вы не можете снять дельги со счета, месяц с последнего пополнения еще не прошел.");
        }
    }
=======

>>>>>>> parent of 9cd04c7 (Homework done - maybe!)
}
