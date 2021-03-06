package com.company;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No Plot here!";
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }
    public String plot(){
        return "A shark eats lots of people!";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Alien plans to take over!!";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Darth Vader Rules!";
    }
}

class Forgettable extends Movie{
    public Forgettable() {
        super("Forgettable");
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        int i = 0;
        while(i<10) {
            System.out.println(randomMovie().plot());
            i++;
        }


    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was "  + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();

        }
        return null;
    }
}
