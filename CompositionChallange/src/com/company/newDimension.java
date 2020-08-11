package com.company;

public class newDimension {
    private int height;
    private int width;
    private int depth;

    public newDimension(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public String Description(){
        return "Height: "+height + "\n" + "Width: "+ width + "\n" + "Depth: "+ depth;
    }
}
