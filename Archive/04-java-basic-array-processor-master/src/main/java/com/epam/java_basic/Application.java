package com.epam.java_basic;

import com.epam.java_basic.array_processor.ArrayProcessor;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

//mport static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {

        int[] array = {-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
//        //System.out.println("Исхлдный Массив: ");
//        // Выводим исходный массив
//       // System.out.println("Исходный массив:");
//        // Создаем объект класса и вызываем метод
//        ArrayProcessor processor = new ArrayProcessor();
//        processor.swapMaxNegativeAndMinPositiveElements(array);
//        // Выводим измененный массив
//        //System.out.println("Массив после замены:");
////        for (int num : array) {
////            System.out.println(num + " ");
////        }
//
//    }
        int [] result;

        ArrayProcessor processor = new ArrayProcessor();
        processor.countSumOfElementsOnEvenPositions(array);



        System.out.println("Массив после замены:");
        for (int num : array) {
            System.out.println(num + " ");
        }

    }
}
















