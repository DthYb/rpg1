package com.example;

public class Main {
    public static void main(String[] args) {
        Chevalier chevalier = new Chevalier();
        System.out.println("WELCOME TO THE World of Warcraft !");
        System.out.println("Personnage:" + chevalier.getName());
        System.out.println("PF:" + chevalier.getStrenght());
        System.out.println("PV:" + chevalier.getHealthPoints());
        System.out.println("+100 xp");
        System.out.println("LEVEL UP");
        chevalier.levelUp();
        System.out.println("PF:" + chevalier.getStrenght());
        System.out.println("PV:" + chevalier.getHealthPoints());
        chevalier.fight();
    }
}