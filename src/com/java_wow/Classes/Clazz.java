package com.java_wow.Classes;

import java.util.Scanner;

public class Clazz {

    private String name;
    private String description;
    private Object[] attributes;

    public Clazz(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName(){
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

    public Object[] getAttributes() {
        return this.attributes;
    }

    public void setAttributes(Object[] attributes) {
        this.attributes = attributes;
    }

    public static void main(String[] args) {

    }

    public static Clazz createClazz(String name, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the class: ");
        name = scanner.nextLine();

        Clazz newClazz = new Clazz(name, description);
        return newClazz;
    }
}
