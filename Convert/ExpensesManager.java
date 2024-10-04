package Convert;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpensesManager {
    ArrayList <Double> expenses;
    Scanner scanner = new Scanner(System.in);

    ExpensesManager() {
        expenses = new ArrayList<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;

        System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 5000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.size(); i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses.get(i) + " тенге");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;

        for(Double i: expenses) {
            if (i>maxExpense) {
                maxExpense = i;
            }
        }

        return maxExpense;
    }

    double inputExpense() {
        double sum = 0;

        while (true) {
            System.out.println("Введите размер траты:");

            double input = scanner.nextDouble();
            this.expenses.add(input);

            if (input == 0.0) {
                break;
            }
            sum = sum + input;
        }
        return sum;
    }
}


