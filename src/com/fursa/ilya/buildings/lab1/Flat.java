package com.fursa.ilya.buildings.lab1;

//описание квартиры жилого дома
public class Flat {
    private static final int DEFAULT_ROOM_COUNT = 2;
    private static final double DEFAULT_FLAT_SQUARE = 50.0;
    private double square;
    private int roomCounter;

    public Flat() {
        this.square = DEFAULT_FLAT_SQUARE;
        this.roomCounter = DEFAULT_ROOM_COUNT;
    }

    public Flat(double square) {
        this.square = square;
        this.roomCounter = DEFAULT_ROOM_COUNT;
    }

    public Flat(double square, int roomCounter) {
        this.square = square;
        this.roomCounter = roomCounter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getRoomCounter() {
        return roomCounter;
    }

    public void setRoomCounter(int roomCounter) {
        this.roomCounter = roomCounter;
    }
}
