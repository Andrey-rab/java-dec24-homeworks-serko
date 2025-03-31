package ru.otus.java.basic.homeworks.homework15;

public class ArrayChecker {
    public static void checkArraySize(String[][] array) throws AppArraySizeException {
        if(array.length != 4){
            throw new AppArraySizeException("Ошибка: массив должен содержать 4 строки. Найдено: " + array.length);
        }
        for (int i = 0; i < array.length; i++){
            if (array[i].length != 4) {
                throw new AppArraySizeException("Ошибка: строка " + i + " содержит " + array[i].length + " элементов, должно быть 4.");
            }
        }
        System.out.println("Массив имеет правильный размер 4x4.");
    }
}
