package com.java_wow.Classes;
import java.util.Scanner;

public class Class {

    private String name;
    private String description;

    public Class(String name, String description) {
        this.name = name;
        this.description = description;
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

    public static void main(String[] args) {

    }

    public static Class createClass(String name, String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the class: ");
        name = scanner.nextLine();

        Class newClass = new Class(name, description);
        return newClass;
    }
}
