package com.java_wow.Classes;

public class Warrior extends Class{
    public Warrior(String name, String description) {
        super(name, description);
    }

    public static Warrior createWarrior(String name, String description) {
        Warrior warrior = new Warrior(name, description);
        return warrior;
    }

    public static void main(String[] args) {

    }


}
