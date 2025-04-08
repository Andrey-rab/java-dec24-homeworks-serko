package ru.otus.java.basic.homeworks.homeworks16;
import java.util.List;

import java.util.ArrayList;

public class Apphw16 {
    public static void main(String[] args) {
        int min = -2;
        int max = 10;
        List<Integer> list = List.of(-2, 0, 1, 6, 3, 8, 4, 10);
        System.out.println(createListInRange(min, max));
        System.out.println(sumGreaterThanFive(list));
    }
    /**
     * Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList
     * с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
     */
    public static ArrayList<Integer> createListInRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++){
            list.add(i);
        }
        return list;
    }

    /**
     * Реализуйте метод, принимающий в качестве аргумента список целых чисел,
     * суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
     */
    public static int sumGreaterThanFive(List<Integer> numbers) {
        int sum = 0;
        for (int number: numbers){
            if (number > 5){
                sum += number;
            }
        }
        return sum;
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
}
