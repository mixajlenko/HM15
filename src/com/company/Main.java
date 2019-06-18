package com.company;

public class Main {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println("П: " + one.getSize() );
        System.out.println("В: " + two.getSize());

        one.bark();
        two.bark();
    }
}
