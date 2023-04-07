package com.epam.mjc.stage0;

public class Bird extends Animal{

    private int wings = 2;
    public Bird() {
        super("blue", 2, false);
    }

    public Bird(String color, int numberOfPaws, boolean hasFur, int wings) {
        super(color, numberOfPaws, hasFur);
        this.wings = wings;
    }

    @Override
    public String getDescription() {
        return "This animal is mostly "+getColor()+". It has "+getNumberOfPaws()+" paws and no fur. Moreover, it has "+wings+" wings and can fly.";
    }

    public static void main(String[] args) {
        new Dog().getDescription();
        new Bird().getDescription();
    }

}
