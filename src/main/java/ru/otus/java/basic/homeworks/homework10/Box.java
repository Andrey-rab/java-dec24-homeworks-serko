package ru.otus.java.basic.homeworks.homework10;

public class Box {
    /**
     * Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
     * Коробку можно открывать и закрывать. Коробку можно перекрашивать. Изменить размер коробки после
     * создания нельзя. У коробки должен быть метод, печатающий информацию о ней в консоль. В коробку можно
     * складывать предмет (если в ней нет предмета), или выкидывать его оттуда (только если предмет в ней есть),
     * только при условии что коробка открыта (предметом читаем просто строку). Выполнение методов должно
     * сопровождаться выводом сообщений в консоль.
     */
    private final double size;
    private String color;
    private boolean isOpen;
    private String item;

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean open) {
        isOpen = open;
    }

    public String getItem() {
        return item;
    }
    public void setIten(String item) {
        this.item = item;
    }

    public Box(double size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = false;  // По умолчанию коробка закрыта
        this.item = null;     // По умолчанию предмета внутри нет
    }

    public void close() {
        if(isOpen = true){
            isOpen = false;
            System.out.println("Вы закрыли коробку");
        } else if(isOpen = false){
            System.out.println("коробка уже закрыта");
        }
    }
    public void open() {
        if(isOpen = false){
            isOpen = true;
            System.out.println("Вы открыли коробку");
        } else if(isOpen = true){
            System.out.println("коробка уже открыта");
        }
    }
    public void printInfoBox() {
        System.out.println("Цвет: " + color);
        System.out.println("Размер: " + size);
    }
}
