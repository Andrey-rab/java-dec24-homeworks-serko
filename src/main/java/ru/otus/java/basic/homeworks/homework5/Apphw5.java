package ru.otus.java.basic.homeworks.homework5;

public class Apphw5 {
    public static void main(String[] args) {
        printlnStringQuantityInt(6,"Text string");
        int[] arr = {1, 20, 3, 40, 5, -20, 0};
        amountMoreFive(arr);
        replaceArgument(4, arr);


    }

    public static void printlnStringQuantityInt(int a, String b) {
        for (int i = 0; i < a; i++ ){
            System.out.println(b);
        }
    }

    public static void amountMoreFive(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            if(array[i] > 5){
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public static void replaceArgument(int a, int[] numbers) {

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = a;
        }
        for (int num : numbers) {
            System.out.print(num + " ");
        }


    }
}
