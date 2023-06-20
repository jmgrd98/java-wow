package com.java_wow.Races;

public class Elf extends Race{

            public Elf(String name, String description) {
                super(name, description);
            }

            public static Elf createElf(String name, String description) {
                Elf elf = new Elf(name, description);
                return elf;
            }

            public static void main(String[] args) {

            }
}
