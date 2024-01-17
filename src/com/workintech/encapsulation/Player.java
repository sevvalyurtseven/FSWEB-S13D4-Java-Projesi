package com.workintech.encapsulation;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;
        this.healthPercentage = healthPercentage;
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    private void checkHealth (int healthPercentage){
        if(healthPercentage < 0){
            this.healthPercentage = 0;
        }
        if (healthPercentage > 100){
            this.healthPercentage = 100;
        }
    }
}
