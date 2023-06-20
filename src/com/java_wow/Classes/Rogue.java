package com.java_wow.Classes;

public class Rogue extends Class{
    public Rogue(String name, String description) {
        super(name, description);
    }

    public static Rogue createRogue(String name, String description) {
        Rogue rogue = new Rogue(name, description);
        return rogue;
    }

    public static void main(String[] args) {

    }
}
