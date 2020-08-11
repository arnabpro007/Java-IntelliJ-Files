package com.company;

public class Room {
    private Bed thebed;
    private Table thetable;

    public Room(Bed thebed, Table thetable) {
        this.thebed = thebed;
        this.thetable = thetable;
    }

    public void Description(){
        System.out.println("Room Description: ");
        this.thebed.Description();
        this.thetable.Description();
    }
}
