package com.java_wow;

public class Character{

    private String name;
    private String description;
    private int strength;
    private int agility;
    private int intelligence;
    private int health;
    private int mana;

    public Character(String name, String description, int strength, int agility, int intelligence, int health, int mana) {
        this.name = name;
        this.description = description;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        System.out.println("Name: " + this.name);
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);
    }
    public String getDescription() {
        System.out.println("Description: " + this.description);
        return this.description;
    }
    public void setDescription(String description) {
        this.description = description;
        System.out.println("Description: " + this.description);
    }
    public int getStrength() {
        System.out.println("Strength: " + this.strength);
        return this.strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
        System.out.println("Strength: " + this.strength);
    }
    public int getIntelligence() {
        System.out.println("Intelligence: " + this.intelligence);
        return this.intelligence;
    }
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
        System.out.println("Intelligence: " + this.intelligence);
    }
    public int getAgility() {
        System.out.println("Agility: " + this.agility);
        return this.agility;
    }
    public void setAgility(int agility) {
        this.agility = agility;
        System.out.println("Agility: " + this.agility);
    }
    public int getHealth() {
        System.out.println("Health: " + this.health);
        return this.health;
    }
    public void setHealth(int health) {
        this.health = health;
        System.out.println("Health: " + this.health);
    }
    public int getMana() {
        System.out.println("Mana: " + this.mana);
        return this.mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
        System.out.println("Mana: " + this.mana);
    }
}
