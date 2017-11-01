package com.fursa.ilya.buildings.lab1;

public class Dwelling {
    private DwellingFloor[] dwellingFloors;
    private int floorsCounter;

    public Dwelling(DwellingFloor[] dwellingFloors, int floorsCounter) {
        this.dwellingFloors = dwellingFloors;
        this.floorsCounter = floorsCounter;
    }

    public Dwelling(DwellingFloor[] dwellingFloors) {
        this.dwellingFloors = dwellingFloors;
    }

    public int getTotalFloorsCounter() {
        return dwellingFloors.length;
    }

    public int getTotalFlatsCounter() {
        int flatsCounter = 0;
        for (DwellingFloor floor : dwellingFloors) {
            flatsCounter += floor.getFlatsCounter();
        }
        return flatsCounter;
    }

    public double getTotalFlatsSquare() {
        double square = 0;
        for (DwellingFloor floor : dwellingFloors) {
            square += floor.getTotalSquare();
        }
        return square;
    }

    public int getTotalRoomsCounter() {
        Flat[] flats;
        int rooms = 0;
        for (int i = 0; i < dwellingFloors.length; i++) {
            flats = dwellingFloors[i].getFlats();
            for (int j = 0; j < flats.length; j++) {
                rooms = flats[j].getRoomCounter();
            }
        }
        return rooms;
    }

    public DwellingFloor[] getDwellingFloors() {
        return dwellingFloors;
    }

    public DwellingFloor getFloorByIndex(int index) {
        return dwellingFloors[index];
    }

    public Flat getBestSpace() {
        Flat[] flats = new Flat[dwellingFloors.length];
        double maxSquare = 0;
        int index = 0;
        for (int i = 0; i < dwellingFloors.length; i++) {
            flats = dwellingFloors[i].getFlats();

            for (int j = 0; j < flats.length; j++) {
                if (flats[j].getSquare() > maxSquare) {
                    index = j;
                }
            }
        }
        return flats[index];
    }

    public Flat[] getSortedArray(int floorIndex) {
        return dwellingFloors[floorIndex].getSortedArray();
    }


}
