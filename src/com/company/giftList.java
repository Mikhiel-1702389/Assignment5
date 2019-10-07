package com.company;

public class giftList {
    private Node head;

    public giftList() {
    }

    public giftList(Node head) {
        this.head = head;
    }

    private boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    private boolean isFull() {
        Node temp = new Node();
        if (head == null) {
            return true;
        } else {
            temp = null;
            return false;
        }
    }

    public boolean addGiftBasketToEnd(giftBasket basket){
        if(isFull()){
            System.out.println("Unable to add: list full!");
        } else {
            Node nextItem = new Node();
            nextItem.setData(basket);
            if(isEmpty()){
                head = nextItem;
            } else {
                Node temp = head;
                while (temp.getNext() != null) {
                    temp = temp.getNext();
                }
                temp.setNext(nextItem);
            }
        }
        return false;
    }

    public void showAllGiftBaskets() {
        Node current = head;
        if (isEmpty()) {
            System.out.println("There is nothing to print!");
        } else {
            System.out.println("Gift baskets in current list: ");
            while (current != null) {
                System.out.println(current.getData() + "");
                current = current.getNext();
            }
        }
    }


}
