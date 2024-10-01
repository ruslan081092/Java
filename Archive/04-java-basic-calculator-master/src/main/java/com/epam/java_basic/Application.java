package com.epam.java_basic;

import com.epam.java_basic.calculator.Calculator;
import java.nio.DoubleBuffer;
import java.util.Scanner;


/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double a = scanner.nextInt();
        System.out.println("Enter the second number:");
        double b = scanner.nextInt();
        System.out.println("Enter operator (+, -, *, /):");
        char symbol = scanner.next().charAt(0);
        switch (symbol) {
            case ('+'):
                calculator.add(a, b);
                break;
            case ('-'):
                calculator.subtract(a, b);
                break;
            case ('*'):
                calculator.multiply(a, b);
                break;
            case ('/'):
                calculator.div(a, b);
                break;
        }





        }
//        if (symbol == '+') {
//            calculator.add(a,b);
//            System.out.println(calculator.add(a,b));
//        } else if (symbol == '-') {
//            calculator.subtract(a,b);
//        } else if (symbol == '*') {
//            calculator.multiply(a,b);
//        } else if (symbol == '/') {
//            calculator.div(a,b);
//        }


    }




