package Lesson06.online.models;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 02.10.2021
 */

public abstract class Hero {

    protected String name;
    protected float health;
    protected float speedMove;
    protected boolean customField;

    public Hero(String name, float health, float speedMove) {
        this.name = name;
        this.health = health;
        this.speedMove = speedMove;
    }

    public Hero(String name) {
        this.name = name;
        this.health = 500.0f;
        this.speedMove = 100.0f;
    }

    public abstract void attack(float value);

    public void speak() {
        System.out.println(name + " says Hello");
    }

    public void move(){
        System.out.println(name + " has moved with speed " + speedMove);
    }

}
