package com.java_wow.Races;
import com.java_wow.Classes.Clazz;

public class Orc extends Race{

            public Orc(String name, String description, Clazz clazz) {
                super(name, description);
            }

            public static Orc createOrc(String name, String description, Clazz clazz) {
                Orc orc = new Orc(name, description, clazz);
                return orc;
            }

            public static void main(String[] args) {

            }
}
