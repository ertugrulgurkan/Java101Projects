package com.ertugrul.boksmaci;

import java.util.Random;

public class Fighter {
    String name;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int health, int weight, double dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        Random r = new Random();
        int a = r.nextInt(10);
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + a + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        return Math.max(foe.health - a, 0);

    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}