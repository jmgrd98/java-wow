package com.java_wow.Races;

public class Human extends Race{

        public Human(String name, String description) {
            super(name, description);
        }

        public static Human createHuman(String name, String description) {
            Human human = new Human(name, description);
            return human;
        }

        public static void main(String[] args) {

        }
}
