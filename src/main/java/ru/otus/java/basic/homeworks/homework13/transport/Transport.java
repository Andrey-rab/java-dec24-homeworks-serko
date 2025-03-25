package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public interface Transport {
    String getType();

    boolean move(int distance, TerrainType terrain);

}