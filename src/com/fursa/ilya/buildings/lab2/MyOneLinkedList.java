package com.fursa.ilya.buildings.lab2;

public class MyOneLinkedList<E> {
    private Node head; //на первый элемент
    private Node tail; //на последний элемент

    public void addAsFirst(E item) { //добавить спереди
        Node node = new Node();
        node.e = item;
        if (head == null) {          //если список пуст,то указываем ссылки начала и конца на новый элемент
            head = node;            //т.е. список теперь состоит из одного элемента
            tail = node;
        } else {
            node.next = head;          //иначе новый элемент теперь ссылается на "бывший" первый
            head = node;               //а указатель на первый элемент теперь ссылается на новый элемент
        }
    }

    public void addAsLast(E item) { //добавление в конец списка
        Node node = new Node(); //создаем новый элемент
        node.e = item;

        if (tail == null) { //если список пустой
            head = node; //то задаем ссылки на начало и конец
            tail = node; //тем самым список состоит из одного элемента
        } else {
            tail.next = node; //иначе "старый" последний элемент теперь ссылается на новый
            tail = node;  //а в указатель на последний элемент записываем адрес нового элемента
        }
    }

    public void printAll() { //вывод на экран
        Node first = head; //получаем ссылку на первый элемент
        while (first != null) { //пока существует выводим на экран
            System.out.println(first.e + " ");
            first = first.next; //переключаемся на следующий
        }
    }

    public void remove(E item) { //удаление элемента
        if (head == null) { //если список пуст, ничего не делаем
            return;
        }
        if (head == tail) { //если состоит из одного элемента очищаем хвост и голову
            head = null;
            tail = null;
            return;
        } //иначе начинаем перебирать пока следующий элемент существует
        Node first = head;
        while (first.next != null) {
            if (tail == first.next) {
                tail = first;
            }
            first.next = first.next.next;
            return;
        }
        first = first.next;
    }


}
