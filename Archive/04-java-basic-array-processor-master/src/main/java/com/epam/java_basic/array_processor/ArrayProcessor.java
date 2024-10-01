package com.epam.java_basic.array_processor;


public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
//В массиве целых чисел поменять местами максимальный отрицательный элемент и минимальный положительный
        int maxNegative = Integer.MIN_VALUE;
        int minPositive = Integer.MAX_VALUE;
        int maxNegativeIndex = -1;
        int minPositiveIndex = -1;

        // Поиск максимального отрицательного и минимального положительного элементов
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0 && input[i] > maxNegative) {
                maxNegative = input[i];
                maxNegativeIndex = i;
            }
            if (input[i] > 0 && input[i] < minPositive) {
                minPositive = input[i];
                minPositiveIndex = i;
            }
        }

        // Если оба индекса найдены, меняем элементы местами
        if (maxNegativeIndex != -1 && minPositiveIndex != -1) {
            int temp = input[maxNegativeIndex];
            input[maxNegativeIndex] = input[minPositiveIndex];
            input[minPositiveIndex] = temp;
        }

        return input; // Возвращаем измененный массив

    }

    public int[] countSumOfElementsOnEvenPositions(int[] input) {
        //В массиве целых чисел определить сумму элементов, стоящих на чётных позициях
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                sum = sum + i;
            }
        }
        return input;
    }
}












//
//        int sum = 0;
//
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] % 2 == 0) {
//                sum = sum + i;
//            }
//        }
//    }
//}

//
//        public int[] replaceEachNegativeElementsWithZero (int[] input){
//            throw new UnsupportedOperationException("You need to implement this method");
//        }
//
//        public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative (int[] input){
//            throw new UnsupportedOperationException("You need to implement this method");
//        }
//
//        public float calculateDifferenceBetweenAverageAndMinElement (int[] input){
//            throw new UnsupportedOperationException("You need to implement this method");
//        }
//
//        public int[] findSameElementsStandingOnOddPositions (int[] input){
//            throw new UnsupportedOperationException("You need to implement this method");
//        }}



