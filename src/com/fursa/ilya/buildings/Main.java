package com.fursa.ilya.buildings;

import com.fursa.ilya.buildings.lab1.Dwelling;
import com.fursa.ilya.buildings.lab1.DwellingFloor;
import com.fursa.ilya.buildings.lab1.Flat;
import com.fursa.ilya.buildings.lab2.MyOneLinkedList;

public class Main {

    public static void main(String[] args) {
        Flat[] flats = new Flat[10];
        for (int i = 0; i < flats.length; i++) {
            flats[i] = new Flat(10 * i + 10, 1 + i);
            System.out.println("[+] Flat " + i + " has " + flats[i].getRoomCounter() + " rooms and " + flats[i].getSquare() + " meters");
        }
        //добавляем созданные квартиры на этаж и применяем ранее написанные методы
        DwellingFloor dwellingFloor = new DwellingFloor(flats);
        System.out.println("[!]Total square: " + dwellingFloor.getTotalSquare());
        System.out.println("[!]Total flats: " + dwellingFloor.getFlatsCounter());
        //получение квартиры по номеру на этаже
        System.out.println("[!] Flat №" + 4 + " has " + dwellingFloor.getFlatByIndex(4).getSquare() + " meters and "
                + dwellingFloor.getFlatByIndex(4).getRoomCounter() + " rooms");

        //тестирование метода добавления квартиры на этаж
        dwellingFloor.addFlatByIndex(6, new Flat(99,99));


        //тестирование метода удаляющего квартиру по номеру
        dwellingFloor.update(1, new Flat(111, 2));
        dwellingFloor.removeFlatByIndex(6);
        //вывод результата
        Flat[] flatsFromFloor = dwellingFloor.getFlats();
        for (int i = 0; i < flatsFromFloor.length; i++) {
            System.out.println("[!]Flat " + i + " has " + flatsFromFloor[i].getSquare() + " meters and " + flatsFromFloor[i].getRoomCounter() + " rooms");
        }

        System.out.println("[!]The largest flat has " + dwellingFloor.getBestSpace().getSquare() + " meters");

        System.out.println("Dwelling class testing： ");
        DwellingFloor dwellingFloor1 = new DwellingFloor(flats);
        DwellingFloor[] dwellingFloors = new DwellingFloor[2];
        dwellingFloors[0] = dwellingFloor;
        dwellingFloors[1] = dwellingFloor1;
        //Dwelling class testing
        Dwelling dwelling = new Dwelling(dwellingFloors);
        System.out.println("Total flats square: " + dwelling.getTotalFlatsSquare());
        System.out.println("Total floors counter: " + dwelling.getTotalFloorsCounter());
        System.out.println("Total rooms counter: " + dwelling.getTotalRoomsCounter());
        System.out.println("Total flats counter: " + dwelling.getTotalFlatsCounter());
        System.out.println("Flats on 1st floor: " + dwelling.getFloorByIndex(0).getFlatsCounter());
        System.out.println("Total square of 1st floor: " + dwelling.getFloorByIndex(0).getTotalSquare());
        System.out.println("Total square of 2nd floor: " + dwelling.getFloorByIndex(1).getTotalSquare());
        System.out.println("Dwelling flat with best space: " + dwelling.getFloorByIndex(0).getBestSpace().getSquare());

        System.out.println("====================");
        System.out.println("Сортировка по убыванию площадей");
        Flat[] sortedFlatsArr = dwelling.getSortedArray(1);
        for (Flat flat: sortedFlatsArr) {
            System.out.println("Квартира имеет площадь: " + flat.getSquare());
        }


        MyOneLinkedList<String> myOneLinkedList = new MyOneLinkedList<>();
        myOneLinkedList.addAsFirst("Hello");
        myOneLinkedList.addAsLast("World");
        myOneLinkedList.addAsLast("My name is Ilya I'm a Java developer");
        myOneLinkedList.remove("World");
        myOneLinkedList.printAll();

    }
}
