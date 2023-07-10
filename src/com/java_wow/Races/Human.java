package com.java_wow.Races;

import com.java_wow.Classes.Clazz;

public class Human extends Race{

        public Human(String name, String description, Clazz clazz) {
            super(name, description);
        }

        public static Human createHuman(String name, String description, Clazz clazz) {
            Human human = new Human(name, description, clazz);
            return human;
        }

        public static void main(String[] args) {

        }
}
