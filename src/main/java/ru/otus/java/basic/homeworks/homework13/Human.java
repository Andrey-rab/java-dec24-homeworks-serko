package ru.otus.java.basic.homeworks.homework13;

import ru.otus.java.basic.homeworks.homework13.transport.Transport;

public class Human {
    private String name;
    private Transport currentTransport;

    public Human(String name) {
        this.name = name;
        this.currentTransport = null;
    }

    public void setTransport(Transport transport) {
        if (currentTransport == null){
            this.currentTransport = transport;
            System.out.println(name + " сел на транспорт: " + transport.getType());
        } else {
            System.out.println(name + " нужно сначала слезть с транспорта: " + currentTransport.getType());
        }

        System.out.println();
    }

    public void dropTransport(){
        if(currentTransport == null){
            System.out.println(name + " не имеет транспорта.");
        } else {
            System.out.println(name + " слез с " + currentTransport.getType());
            currentTransport = null;
        }
        System.out.println();

    }

    public void go(int distance, TerrainType terrain) {
        if (currentTransport == null) {
            System.out.println(name + " идёт пешком " + distance + " км по " + terrain + ".");
        } else {
            System.out.println(name + " пытается поехать на " + currentTransport.getType() + ":");
            boolean success = currentTransport.move(distance, terrain);
            if (!success) {
                System.out.println(name + " не смог выполнить перемещение.");
            }
        }
        System.out.println();
    }

    public void printInfo() {
        System.out.println("Имя: " + name);
        if (currentTransport != null) {
            System.out.println("Текущий транспорт: " + currentTransport.getType());
        } else {
            System.out.println("Текущий транспорт: нет");
        }
        System.out.println();
    }
}
