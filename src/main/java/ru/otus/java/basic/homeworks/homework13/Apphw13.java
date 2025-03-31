package ru.otus.java.basic.homeworks.homework13;

import ru.otus.java.basic.homeworks.homework13.transport.AllTerrainVehicle;
import ru.otus.java.basic.homeworks.homework13.transport.Bicycle;
import ru.otus.java.basic.homeworks.homework13.transport.Car;
import ru.otus.java.basic.homeworks.homework13.transport.Horse;

public class Apphw13 {
    /**
     * Создайте класс Человек с полāми name (имя) и currentTransport (текуûий транспорт)
     * <p>
     * Реализуйте в вашем приложении классы Машина, Лошадь, Велосипед, Вездеход
     * <p>
     * Каждýй из классов должен предоставлāтþ возможностþ перемеûатþсā на определенное расстоāние с
     * указанием типа местности
     * <p>
     * В приложении должнý бýтþ типý местности: густой лес, равнина, болото
     * <p>
     * Человек должен иметþ возможностþ сестþ на лĀбой из ÿтих видов транспорта, встатþ с него, или
     * переместитþсā на некоторое расстоāние (при условии ùто он находитсā на каком-либо транспорте)
     * <p>
     * При попýтке вýполнитþ перемеûение у ùеловека, не исполþзуĀûего транспорт, сùитаем ùто он просто идет
     * указанное расстоāние пеúком
     * <p>
     * При перемеûении Маúина и Вездеход тратāт бензин, которýй у них ограниùен. Лоúадþ тратит силý.
     * Велосипед может исполþзоватþсā без ограниùений (можете длā усложнениā велосипедом тратитþ силý
     * ƈводителāƉ). При вýполнении действиā резулþтат должен бýтþ отпеùатан в консолþ
     * <p>
     * У каждого вида транспорта естþ местности по которýм он не может перемеûатþсā: маúина - густой лес и
     * болото, лоúадþ и велосипед - болото, вездеход - нет ограниùений
     * <p>
     * При попýтке переместитþсā должен бýтþ возвраûен резулþтат true/false - удалосþ ли вýполнитþ действие
     */
    public static void main(String[] args) {
        Human human = new Human("Vasya");

        human.printInfo();
        human.setTransport(new AllTerrainVehicle(4));
        human.setTransport(new Bicycle());
        human.printInfo();
        human.go(3, TerrainType.БОЛОТО);
        human.printInfo();
        human.dropTransport();
        human.printInfo();

    }
}
