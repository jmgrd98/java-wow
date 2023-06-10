package com.java_wow.Classes;

public class Mage extends Class{
    public Mage(String name, String description) {
        super(name, description);
    }

    public static Mage createMage(String name, String description) {
        Mage newMage = new Mage(name, description);
        return newMage;
    }

    public static void main(String[] args) {

    }
}
