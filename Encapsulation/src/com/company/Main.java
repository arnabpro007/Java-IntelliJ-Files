package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player player = new Player();
        player.name = "Arnab";
        player.Health = 25;
        player.weapon = "brain";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.HealthRemaining());

        damage = 16;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.HealthRemaining());

        EnhancedPlayer player1 = new EnhancedPlayer("Keegoz",65,"Nuke");
        damage = 10;
        player1.losehealth(damage);
        System.out.println("Remaining health = " + player1.healthRemaining());

        damage = 16;
        player1.losehealth(damage);
        System.out.println("Remaining health = " + player1.healthRemaining());
    }
}
