package com.fursa.ilya.buildings.lab1;

//этаж жилого здания
public class DwellingFloor {
    private Flat[] flats;
    private int flatsCounter;

    public DwellingFloor(int flatsCounter) {
        this.flatsCounter = flatsCounter;
    }

    public DwellingFloor(Flat[] flats) {
        this.flats = flats;
    }

    public int getFlatsCounter() {
        return flats.length;
    }

    public double getTotalSquare() {
        double square = 0;
        for (int i = 0; i < flats.length; i++) {
            square += flats[i].getSquare();
        }
        return square;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public Flat getFlatByIndex(int index) {
        return flats[index];
    }

    public void update(int index, Flat flat) {
        flats[index] = flat;
    }

    public void removeFlatByIndex(int index) {
        Flat[] tmp = flats;
        flats = new Flat[tmp.length - 1];
        System.arraycopy(tmp, 0, flats, 0, index);
        int amountElemAfterIndex = tmp.length - index - 1;
        System.arraycopy(tmp, index + 1, flats, index, amountElemAfterIndex);
    }

    public void addFlatByIndex(int index, Flat flat) {
        Flat[] tmp = flats;
        flats = new Flat[tmp.length + 1];
        System.arraycopy(tmp, 0, flats, 0, tmp.length);
        flats[flats.length - 1] = flat;
    }

    public Flat getBestSpace() {
        double maxSquare = 0;
        int index = 0;
        for (int i = 0; i < flats.length; i++) {
            if (flats[i].getSquare() > maxSquare) {
                maxSquare = flats[i].getSquare();
                index = i;
            }
        }
        return flats[index];
    }

    public Flat[] getSortedArray() {
        Flat[] flatArr = getFlats();
        for (int i = 0; i < flatArr.length; i++) {
            for (int j = 0; j < flatArr.length; j++) {
                if (flatArr[i].getSquare() > flatArr[j].getSquare()) {
                    Flat tmp = flatArr[i];
                    flatArr[i] = flatArr[j];
                    flatArr[j] = tmp;
                }
            }
        }
        return flatArr;
    }
}
