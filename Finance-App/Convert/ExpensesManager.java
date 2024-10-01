package Convert;

public class ExpensesManager {
    double[] expenses; // Замените массив списком

    ExpensesManager() {
        expenses = new double[7]; // Создайте список в конструкторе
    }

    // Номер дня больше не нужен
    double saveExpense(double moneyBeforeSalary, double expense, int day) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        expenses[day - 1] = expenses[day - 1] + expense; // Эту строку нужно убрать
        System.out.println("Значение сохранено! Ваш текущий баланс в тенге: " + moneyBeforeSalary);
        if (moneyBeforeSalary < 5000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Трата № " + (i + 1) + ". Потрачено " + expenses[i] + " тенге");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) { // Используйте сокращённую форму цикла
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}

