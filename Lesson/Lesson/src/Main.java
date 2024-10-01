import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int [] arr = new int [10];
        for(int num: arr){
            System.out.println(num);
        }

        }
    }






//        Scanner scanner = new Scanner(System.in);
//        Converter converter = new Converter(444.06, 489.32, 3.81);
//        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
//        ExpensesManager expensesManager = new ExpensesManager();
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            printMenu();
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
//                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
//                int currency = scanner.nextInt();
//                converter.convert(moneyBeforeSalary, currency);
//            } else if (command == 2) {
//                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
//            } else if (command == 3) {
//                moneyBeforeSalary = expensesManager.saveExpense(scanner, moneyBeforeSalary);
//            } else if (command == 4) {
//                expensesManager.printAllExpenses();
//            } else if (command == 5) {
//                System.out.println("Самая большая сумма расходов на этой неделе составила " + expensesManager.findMaxExpense() + "тенге");
//            } else if (command == 0) {
//                System.out.println("Выход");
//                break;
//            } else {
//                System.out.println("Извините, такой команды пока нет.");
//            }
//        }
//    }
//
//    public static void printMenu() {
//        System.out.println("Что вы хотите сделать? ");
//        System.out.println("1 - Конвертировать валюту");
//        System.out.println("2 - Получить совет");
//        System.out.println("3 - Ввести трату");
//        System.out.println("4 - Показать траты за неделю");
//        System.out.println("5 - Показать самую большую сумму расходов за неделю");
//        System.out.println("0 - Выход");


