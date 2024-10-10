package Convert;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();
        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();
        Converter converter = new Converter(444.06, 489.32, 3.14);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpensesManager expensesManager = new ExpensesManager();

        while (true) {
            printMenu();

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");

                int currency = scanner.nextInt();

                converter.convert(moneyBeforeSalary, currency);
            } else if (command == 2) {
                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
            } else if (command == 3) {
                double totalSum = expensesManager.inputExpense();
                expensesManager.saveExpense(moneyBeforeSalary, totalSum);
            } else if (command == 4) {
                expensesManager.printAllExpenses();
            } else if (command == 5) {
                System.out.println("Самая большая сумма расходов составила " + expensesManager.findMaxExpense() + " тенге.");
            } else if (command == 6) {
            //«6 — Очистить список трат»;
                expensesManager.removeAllExpenses();
            } else if (command == 7) {
                //«7 — Найти и удалить трату».
                if(!expensesManager.expenses.isEmpty()) {
                    double expense = scanner.nextDouble();
                    expensesManager.removeExpense(expense);


                } else {
                    System.out.println("Список трат пуст.");
                }

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Конвертировать валюту");
        System.out.println("2 - Получить совет");
        System.out.println("3 - Ввести трату");
        System.out.println("4 - Показать траты");
        System.out.println("5 - Показать самую большую сумму расходов");
        System.out.println("6 - Очистить список трат"); // "6 - Очистить список трат"
        System.out.println("7 - Найти и удалить трату"); // "7 - Найти и удалить трату"
        System.out.println("0 - Выход");
    }
}
