package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    private ArrayList<String> items;
    private int capacity;


    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public Basket(){
        this(10);
    }


    public boolean isFull() {
        return items.size() >=capacity;

    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean addBagel(String bagel){
        if (isFull()) {
            return false;
        }

        if (items.contains(bagel)){
            return false;
        }

        items.add(bagel);
        return true;
    }




