package com.company;

public class Player {
    public String name;
    public int Health;
    public String weapon;

    public void loseHealth(int damage){

        this.Health = this.Health - damage;
        if (this.Health <= 0){
            System.out.println("Player Died!");
        }
    }

    public int HealthRemaining(){
        return this.Health;
    }
}
