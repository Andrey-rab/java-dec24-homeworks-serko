package ru.otus.java.basic.homeworks.homework13.transport;

import ru.otus.java.basic.homeworks.homework13.TerrainType;

public abstract class Transport {
    public abstract String getType();

    public abstract void move(int distance, TerrainType terrain);
}
