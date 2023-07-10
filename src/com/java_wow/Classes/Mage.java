package com.java_wow.Classes;
import com.java_wow.Races.Race;

public class Mage extends Clazz{
    public Mage(String name, String description, Race race) {
        super(name, description);
    }

    public static Mage createMage(String name, String description, Race race) {
        Mage mage = new Mage(name, description, race);

        return mage;
    }

    public static void main(String[] args) {

    }
}
