package ru.otus.java.basic.homeworks.homeworks16;

import java.util.List;

import java.util.ArrayList;

public class Apphw16 {
    public static void main(String[] args) {
        int min = -2;
        int max = 10;
        //List<Integer> numbers = List.of(-2, 0, 1, 6, 3, 8, 4, 10);
        List<Integer> numbers = new java.util.ArrayList<>(List.of(1, 2, 3, 4, 5));
        //System.out.println(createListInRange(min, max));
        //System.out.println(sumGreaterThanFive(numbers));
        //fillListWithValue(5, numbers);
        //System.out.println(numbers);
        incrementListElements(2, numbers);
        //System.out.println(numbers);

        List<Employee> employees = List.of(
                new Employee("Tom", 30),
                new Employee("Eliz", 51),
                new Employee("Rick", 22)
        );

        //System.out.println("Имена сотрудников: " + getEmployeeNames(employees));
        //System.out.println("Старше 25 лет: " + filterByMinAge(employees, 25));
        //System.out.println("Средний возраст выше 26? " + isAverageAgeAbove(employees, 26));
        System.out.println("Самый молодой: " + findYoungestEmployee(employees));

    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList
     * с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
     */
    public static ArrayList<Integer> createListInRange(int min, int max) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
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
        for (int number : numbers) {
            if (number > 5) {
                sum += number;
            }
        }
        return sum;
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список,
     * метод должен переписать каждую заполненную ячейку списка указанным числом;
     */
    public static void fillListWithValue(int value, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, value);
        }
    }

    /**
     * Реализуйте метод, принимающий в качестве аргументов целое число и
     * ссылку на список, увеличивающий каждый элемент списка на указанное число;
     */
    public static void incrementListElements(int increment, List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int updateValue = list.get(i) + increment;
            list.set(i, updateValue);
        }
    }

    /**
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
     * <p>
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст,
     * и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
     * <p>
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний
     * возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;
     * <p>
     * Реализуйте метод, принимающий в качестве аргумента список сотрудников, и
     * возвращающий ссылку на самого молодого сотрудника.
     */
    public static List<String> getEmployeeNames(List<Employee> employees) {
        List<String> names = new ArrayList<>();
        for (Employee epm : employees) {
            names.add(epm.getName());
        }
        return names;
    }

    public static List<String> filterByMinAge(List<Employee> employees, int minAge) {
        List<String> result = new ArrayList<>();
        for (Employee epm : employees) {
            if (epm.getAge() >= minAge) {
                result.add(epm.getName());
            }
        }
        return result;
    }

    public static boolean isAverageAgeAbove(List<Employee> employees, int minAverageAge) {
        int sumAgeEmployee = 0;
        for (Employee epm : employees) {
            sumAgeEmployee += epm.getAge();
        }
        if (minAverageAge > sumAgeEmployee / employees.size()) {
            return true;
        }
        return false;
    }

    public static Employee findYoungestEmployee(List<Employee> employees) {
        Employee youngest = employees.get(0);
        for (Employee epm: employees){
            if(epm.getAge() < youngest.getAge()){
                youngest = epm;
            }
        }
        return youngest;
    }

}
