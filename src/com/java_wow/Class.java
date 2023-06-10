package com.java_wow;

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
}
