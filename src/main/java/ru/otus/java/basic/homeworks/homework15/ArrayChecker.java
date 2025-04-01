package ru.otus.java.basic.homeworks.homework15;

public class ArrayChecker {
    public static int sumArray(String[][] array) throws AppArrayDataException, AppArraySizeException {
        // Проверка размера массива
        checkArraySize(array);
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                try {
                    int number = Integer.parseInt(array[row][col]);
                    sum += number;
                } catch (NumberFormatException e) {
                    // Если не удалось преобразовать — бросаем исключение
                    throw new AppArrayDataException("Ошибка в ячейке [" + row + "][" + col + "]: \"" + array[row][col] + "\" не является числом");
                }
            }
        }
        return sum;
    }

    public static void checkArraySize(String[][] array) throws AppArraySizeException {
        if (array.length != 4) {
            throw new AppArraySizeException("Ошибка: массив должен содержать 4 строки. Найдено: " + array.length);
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Ошибка: строка " + i + " содержит " + array[i].length + " элементов, должно быть 4.");
            }
        }
    }
}
