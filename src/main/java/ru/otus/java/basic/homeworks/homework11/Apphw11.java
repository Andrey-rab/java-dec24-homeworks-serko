package ru.otus.java.basic.homeworks.homework11;

import ru.otus.java.basic.homeworks.homework11.animals.Cat;
import ru.otus.java.basic.homeworks.homework11.animals.Dog;
import ru.otus.java.basic.homeworks.homework11.animals.Horse;

public class Apphw11 {
    public static void main(String[] args) {
        /**
         * Создайте классы Cat, Dog и Horse с наследованием от класса Animal
         *
         * У каждого животного есть имя, скорость бега и плавания (м/с), и
         * выносливость (измеряется в условных единицах)
         *
         * Затраты выносливости:
         * Все животные на 1 метр бега тратят 1 ед выносливости,
         * Собаки на 1 метр плавания - 2 ед.
         * Лошади на 1 метр плавания тратят 4 единицы
         * Кот плавать не умеет.
         *
         * Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время, затраченное на
         * указанное действие, и “понижать выносливость” животного. Если выносливости не хватает, то возвращаем
         * время -1 и указываем что у животного появилось состояние усталости. При выполнении действий пишем
         * сообщения в консоль.
         *
         * Добавьте метод info(), который выводит в консоль состояние животного.
         */
        Cat murzik = new Cat("murzik", 3, 0.0, 30);
        Dog bari = new Dog("Bari", 5,1, 50);
        Horse masha = new Horse("Masha",7,2,80);

        murzik.info();
        murzik.run(500);
        murzik.info();
        murzik.swim(1);

        bari.info();
        bari.run(2);
        bari.swim(4);

        masha.info();
        masha.run(10);
        masha.swim(200);
        masha.info();


        //masha.info();
    }
}
