package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public class Horse implements Transport {
    private int stamina; // выносливость

    public Horse(int stamina) {
        this.stamina = stamina;
    }

    @Override
    public String getType() {
        return "Лошадь";
    }

    @Override
    public boolean move(int distance, TerrainType terrain) {
        if (terrain == TerrainType.БОЛОТО) {
            System.out.println("Лошадь не может пройти по " + terrain);
            return false;
        }
        if (stamina < distance) {
            System.out.println("Лошадь устала. Осталось сил: " + stamina + ", требуется: " + distance);
            return false;
        }
        stamina -= distance;
        System.out.println("Лошадь прошла " + distance + " км по " + terrain + ". Осталось сил: " + stamina);
        return true;
    }
}
