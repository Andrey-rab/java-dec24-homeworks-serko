package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Horse extends Transport {
    @Override
    public String getType() {
        return "Лошадь";
    }
    @Override
    public void move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.РАВНИНА  || terrain == TerrainType.ГУСТОЙ_ЛЕС){
            System.out.println("Лошадь проскакала " + distance + " км. по " + terrain);
        } else {
            System.out.println("Лошадь не может ехать по " + terrain);
        }
    }
}
