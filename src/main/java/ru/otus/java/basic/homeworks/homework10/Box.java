package ru.otus.java.basic.homeworks.homework10;

public class Box {
    /**
     * Попробуйте реализовать класс по его описанию: объекты класса Коробка должны иметь размеры и цвет.
     * 2 Коробку можно открывать и закрывать.
     * 3 Коробку можно перекрашивать.
     * 4 Изменить размер коробки после создания нельзя.
     * 5 У коробки должен быть метод, печатающий информацию о ней в консоль.
     * 6 В коробку можно складывать предмет (если в ней нет предмета), или выкидывать его оттуда
     * (только если предмет в ней есть), только при условии что коробка открыта (предметом читаем
     * просто строку). Выполнение методов должно сопровождаться выводом сообщений в консоль.
     */
    private int size;
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

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.isOpen = false;  // По умолчанию коробка закрыта
        this.item = null;     // По умолчанию предмета внутри нет
    }

    public void open() {
        if(!isOpen){
            isOpen = true;
            System.out.println("Вы открыли коробку");
        } else{
            System.out.println("коробка уже открыта");
        }
    }

    public void close() {
        if(isOpen){
            isOpen = false;
            System.out.println("Вы закрыли коробку");
        } else{
            System.out.println("коробка уже закрыта");
        }
    }

    public void changeColor(String newColor) {
        System.out.println("коробка перекрашена из цвета " + color + " в цвет " + newColor);
        this.color = newColor;
        System.out.println();
    }

    public void putItem(String Newitem) {
        if(!isOpen){
            System.out.println("Сначала нужно открыть коробку");
            return;
        }
        if(item == null){
            item = Newitem;
            System.out.println("В коробку положили предмет: " + Newitem);
            System.out.println();
        } else {
            System.out.println("В коробке уже есть предмет");
            System.out.println();
        }
    }

    public void retrieveItem() {
        if(!isOpen){
            System.out.println("Сначала нужно открыть коробку");
            return;
        }
        if(item == null){
            System.out.println("В коробке ничего нет");
            System.out.println();
        } else {
            System.out.println("Вы вытащили из коробки предме: " + item);
            System.out.println();
            item = null;
        }

    }

    public void printInfoBox() {
        System.out.println("Информация о коробке: ");
        System.out.println("Цвет: " + color);
        System.out.println("Размер: " + size);
        System.out.println("состояние коробки: " + (isOpen ? "открыта" : "закрыта"));
        System.out.println("Предмет в коробке: " + (item != null ? item : "пустота"));
        System.out.println();
    }
}
