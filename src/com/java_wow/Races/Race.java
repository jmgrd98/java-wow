package com.java_wow.Races;

public class Race {

    private String name;
    private String description;
    private char gender;

    public Race(String name, String description) {
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
    public char getGender(){
        System.out.println("Gender: " + this.gender);
        return this.gender;
    }
    public void setGender(char gender){
        this.gender = gender;
        System.out.println("Gender: " + this.gender);
    }
}
