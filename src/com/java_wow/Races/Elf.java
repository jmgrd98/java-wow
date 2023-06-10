package com.java_wow.Races;

public class Elf extends Race{

            public Elf(String name, String description) {
                super(name, description);
            }

            public static Elf createElf(String name, String description) {
                Elf newElf = new Elf(name, description);
                return newElf;
            }

            public static void main(String[] args) {

            }
}
