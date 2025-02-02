package com.company;

public class Node {
    private giftBasket data;
    private Node next;

    public Node() {
    }

    public Node(giftBasket data, Node next) {
        this.data = data;
        this.next = next;
    }

    public giftBasket getData() {
        return data;
    }

    public void setData(giftBasket data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
