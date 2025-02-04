package ru.otus.java.basic.homeworks.homeworks7;

public class Apphw7 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int[][] table = {
                {1, -2, 3},
                {11, -1, 50},
                {10, -21, 9},
        };
        // sumOfPositiveElements(table);
        // printSquareSize(5);
        // diagonal(table);
        // System.out.println(findMax(table));
        System.out.println(sumRow(table));
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
        int[][] square = new int[size][size];
        for (int i = 0; i < square.length; i++ ){
            for (int j = 0; j < square[i].length; j++ ){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /**
     * Реализовать метод, принимающий в качестве аргумента квадратный двумерный целочисленный массив, и
     * зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе).
     * Проверять количество строк и столбцов не требуется, условие “квадратности” нужно чтобы упростить вам
     * работу с диагоналями
     */
    public static void diagonal(int[][] array) {
        for (int i = 0; i < array.length; i++ ){
            array[i][0+i] = 0;
            for (int j = 0; j < array[i].length; j++ ){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
     */
    public static int findMax(int[][] array) {
        int valueMax = 0;
        for (int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++ ){
                if (array[i][j] > valueMax){
                    valueMax = array[i][j];
                }
            }
        }
        return valueMax;
    }

    /**
     * Реализуйте метод, который считает сумму элементов второй строки или столбца двумерного массива (по
     * вашему выбору), если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
     */
    public static int sumRow(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++ ){
            for (int j = 0; j < array[i].length; j++ ){
                if (i == 1) {
                    sum += array[i][j];
                } else if (array.length < 2){
                    sum = -1;
                }
            }
        }
        return sum;
    }
}
