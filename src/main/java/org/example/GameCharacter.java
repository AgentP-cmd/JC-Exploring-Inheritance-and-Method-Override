package org.example;

public class GameCharacter {

    public int health = 100;
    public int amount = 0;

    protected void takeDamage(int amount){
        this.amount = amount;
        health -= amount;
    }

    public void display() {
        System.out.println("Regular character takes " + amount + " damage. New health: " + health);
    }
}
