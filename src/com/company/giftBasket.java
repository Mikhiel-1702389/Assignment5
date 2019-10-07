package com.company;

public class giftBasket {
    private int id;
    private String type;
    private float cost;

    public giftBasket() {
        super();
    }

    public giftBasket(int id, String type, float cost) {
        this.id = id;
        this.type = type;
        this.cost = cost;
    }

    private void display(){ System.out.println(toString()); }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
