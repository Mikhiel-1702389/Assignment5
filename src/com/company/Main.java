package com.company;

public class Main {

    public static void main(String[] args) {
        giftList list = new giftList();
        for(int i = 1; i < 3; i++){
            giftBasket basket = new giftBasket();
            list.addGiftBasketToEnd(basket);
        }
        System.out.println("Nodes currently on linked list: ");
        list.showAllGiftBaskets();

    }
}
