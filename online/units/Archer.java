package Lesson06.online.units;

import Lesson06.online.models.Hero;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.10.2021
 */

public class Archer extends Hero {

    private int power;
    private float dex;

    public Archer(String name, float health, int power, float dex, float speedMove) {
        super(name, health, speedMove);
        this.power = power;
        this.dex = dex;
    }

    @Override
    public void attack(float value) {
        System.out.println(name + " attack " + (power * dex));
    }

    public void getDamage(int incomeDamage) {
        health -= incomeDamage;
        System.out.println(name + " get damage " + incomeDamage + ". HP = " + health);
    }

    public void escape() {
        if (health < 10) {
            System.out.println(name + " has escape battle");
        }
    }
}
