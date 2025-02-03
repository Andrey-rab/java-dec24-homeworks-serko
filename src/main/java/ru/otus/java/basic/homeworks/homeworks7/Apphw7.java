package ru.otus.java.basic.homeworks.homeworks7;

public class Apphw7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int[][] table = {
                {1, -2, 3},
                {-4, 5, 6},
                {7, -8, 9}
        };
        sumOfPositiveElements(table);
    }

    /**
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве
     * аргумента целочисленный двумерный массив, метод должен посчитать и
     * вернуть сумму всех элементов массива, которые больше 0;
     */
    public static void sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++ ){
                int value = array[i][j];
                if (value > 0){
                    sum += value;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(sum);
    }
    /**
     * Реализовать метод, который принимает в качестве аргумента int size и
     * печатает в консоль квадрат из символов * со сторонами соответствующей длины;
     */
    public static void printSquareSize(int size) {

    }
}
