package com.fursa.ilya.buildings.lab2;

public class Office {
    private static final double DEFAULT_OFFICE_SQUARE = 250;
    public static final int DEFAULT_ROOM_COUNT = 1;
    private double square;
    private int roomCounter;

    public Office() {
        this.roomCounter = DEFAULT_ROOM_COUNT;
        this.square = DEFAULT_OFFICE_SQUARE;
    }

    public Office(double square) {
        this.roomCounter = DEFAULT_ROOM_COUNT;
        this.square = square;
    }

    public Office(double square, int roomCounter) {
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
