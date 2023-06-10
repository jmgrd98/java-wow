package com.java_wow.Races;

public class Orc extends Race{

            public Orc(String name, String description) {
                super(name, description);
            }

            public static Orc createOrc(String name, String description) {
                Orc newOrc = new Orc(name, description);
                return newOrc;
            }

            public static void main(String[] args) {

            }
}
