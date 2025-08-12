package org.example;

public class ArmoredCharacter extends GameCharacter{

    public int amount = 0;

    @Override
    public void takeDamage(int amount){
        int newAmount = amount/2;
        super.takeDamage(newAmount);
        this.amount = newAmount;
    }

    @Override
    public void display() {
        System.out.println("Armored character takes " + amount + " damage. New health: " + health);
    }
}
