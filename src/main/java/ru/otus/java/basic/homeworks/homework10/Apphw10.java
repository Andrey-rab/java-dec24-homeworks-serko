package ru.otus.java.basic.homeworks.homework10;

public class Apphw10 {
    public static void main(String[] args) {
        User Alex = new User("Alex", "Petrov", "Ivanovich", 1991, "AlPet@mail.ru");
        Alex.printUserInfo();

        User[] users = {
                new User("Alex", "Petrov", "Ivanovich", 1991, "AlPet@mail.ru"),
                new User("Григорий", "Сидоров", "Петрович", 1981, "dfdb@mail.ru"),
                new User("Петр", "Олегович", "Ivanovich", 1972, "bfdb@mail.ru"),
                new User("Виталий", "Малдинович", "Ivanovich", 1967, "dfbg@mail.ru"),
                new User("Олег", "Афанасьевич", "Ivanovich", 1956, "xcbnhngh@mail.ru"),
                new User("Василий", "Гуляевич", "nuyn", 1949, "jhnghn@mail.ru"),
                new User("Дмитрий", "вамива", "Ivamjhmnovich", 2001, "mdqwdqw@mail.ru"),
                new User("Андрей", "Отывь", "vdfvsd", 1980, "sdcsdc@mail.ru"),
                new User("Илья", "Иванович", "vdfvdfv", 2024, "csdvfd@mail.ru"),
                new User("Сергей", "Иванович", "dvsdfvbdfv", 1995, "fgbrte@mail.ru"),
        };
        System.out.println(" ");
        System.out.println("пользователи, старше 40 лет:");
        for(int i = 0; i < users.length; i++){
            if(2025 - users[i].getBirthYear() > 40){
                System.out.println(" ");
                users[i].printUserInfo();
            }
        }

        Box myBox = new Box(30, "red");
        myBox.open();

    }
}
