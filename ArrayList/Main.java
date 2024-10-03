package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


        for (int i = 0; i < arr.size(); i++) {
            if (!arr.equals(0)) {
                System.out.println("Введите Значение в ArrayList");
                arr.add(i);
            }
        }
    }
}
