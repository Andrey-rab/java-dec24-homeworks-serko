package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class AllTerrainVehicle extends Transport {
    @Override
    public String getType() {
        return "Вездеход";
    }


    @Override
    public void move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.РАВНИНА || terrain == TerrainType.ГУСТОЙ_ЛЕС || terrain == TerrainType.БОЛОТО) {
            System.out.println("Вездиход проехал " + distance + " км. по " + terrain);
        } else {
            System.out.println("Вездиход не может ехать по " + terrain);
        }
    }
}
