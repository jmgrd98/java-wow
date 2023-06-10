package com.java_wow.Classes;

public class Warrior extends Class{
    public Warrior(String name, String description) {
        super(name, description);
    }

    public static Warrior createWarrior(String name, String description) {
        Warrior newWarrior = new Warrior(name, description);
        return newWarrior;
    }

    public static void main(String[] args) {

    }


}
