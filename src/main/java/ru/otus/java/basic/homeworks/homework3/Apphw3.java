package ru.otus.java.basic.homeworks.homework3;

import java.util.Scanner;

public class Apphw3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от 1 до 5");
        int result = scanner.nextInt();

        if (result == 1){
            greetings();
        } else if (result == 2){
            checkSign(3, -4,-5);
        } else if (result == 3){
            selectColor();
        } else if (result == 4){
            compareNumbers();
        } else if (result == 5){
            addOrSubtractAndPrint(10, 5,true);
        } else {
            System.out.println("Вы ввели не верное число. Введите число от 1 до 5");
        }

    }
    public static void greetings (){
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("from");
        System.out.println("Java");
    }
    public static void checkSign (int a, int b, int c){
        int sum_int = a + b + c;
        if (sum_int >= 0) {
            System.out.println("Сумма положительная");
        }
        if (sum_int <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void selectColor (){
        int data = 15;
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(){
        int a = 12;
        int b = -5;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment){
        if (increment){
            int result = initValue + delta;
            System.out.println("Результат: " + result);
        } else {
            int result = initValue - delta;
            System.out.println("Результат: " + result);
        }
    }
}
