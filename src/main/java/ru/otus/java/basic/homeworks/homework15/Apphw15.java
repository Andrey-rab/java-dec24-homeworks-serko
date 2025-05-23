package ru.otus.java.basic.homeworks.homework15;

public class Apphw15 {
    public static void main(String[] args) {
        /**
         * Реализуйте метод, аргументом которого является двумерный строковый массив размером 4х4.
         * Если передан массив другого размера необходимо бросить исключение AppArraySizeException.
         *
         * Метод должен обойти все элементы массива, преобразовать в int и просуммировать.
         * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит текст
         * вместо числа), должно быть брошено исключение AppArrayDataException с детализацией,
         * в какой именно ячейке лежат неверные данные.
         *
         * В методе main() необходимо вызвать полученный метод, обработать возможные исключения
         * AppArraySizeException и AppArrayDataException и вывести результат расчета (сумму элементов,
         * при условии что подали на вход корректный массив).
         */
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] wrongSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11", "12"}
        };

        String[][] wrongDataArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "буква", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int result = ArrayChecker.sumArray(wrongDataArray);
            System.out.println("Сумма элементов массива: " + result);
        } catch (AppArraySizeException e) {
            System.out.println(" Произошла ошибка размера массива: " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println(" Произошла ошибка двнных в массиве: " + e.getMessage());
        }


    }


}
