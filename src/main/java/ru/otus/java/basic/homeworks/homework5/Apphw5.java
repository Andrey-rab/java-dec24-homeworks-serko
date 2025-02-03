package ru.otus.java.basic.homeworks.homework5;

import java.util.Arrays;

public class Apphw5 {
    public static void main(String[] args) {

        printlnStringQuantityInt(6,"Text string");

        int[] arr = {1, 20, 3, 40, 5, -20, 0};
        int[] arr_two = {1, 10, 2, 3, 41, -20, 0};
        int[] arr_large_half = {141, 2, 3, 3, 41, -20, 0};

        amountMoreFive(arr);

        replaceArgument(4, arr);

        arrayEnlargement(1, arr_two);

        largeHalf(arr_large_half);
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и строку,
     * и печатающий в консоль строку указанное количество раз
     */
    public static void printlnStringQuantityInt(int a, String b) {
        for (int i = 0; i < a; i++ ){
            System.out.println(b);
        }
    }

    /**
     * Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
     * суммирующий все элементы, значение которых больше 5, и печатающий полученную сумму в консоль.
     */
    public static void amountMoreFive(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 5){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    //Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на
    // целочисленный массив, метод должен заполниться каждую ячейку массива указанным числом.
    public static void replaceArgument(int a, int[] numbers) {

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = a;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на
    // целочисленный массив, увеличивающий каждый элемент которого на указанное число.
    public static void arrayEnlargement(int a, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += a;
        }
        System.out.println("arr=" + Arrays.toString(numbers));
    }

    // Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
    // и печатающий в консоль сумма элементов какой из половин массива больше
    public static void largeHalf(int[] numbers) {
        int summ_left = 0;
        int summ_right = 0;
        for(int i = 0; i < numbers.length / 2; i++) {
            summ_left += numbers[i];
        }

        for(int i = numbers.length / 2; i < numbers.length; i++) {
            summ_right += numbers[i];
        }

        if (summ_left > summ_right){
            System.out.println("левая половина массива больше и равна " + summ_left);
        } else if(summ_right > summ_left){
            System.out.println("правая половина массива больше и равна " + summ_right);
        } else {
            System.out.println("суммы сторон массива равны. Сумма каждой стороны: " + summ_right);
        }
    }
}
