package com.github.padlaboris.basic.BoxConstructor;

public class Box {
    double width;
    double height;
    double depth;

    //This is the constructor for the BoxInheritance.
    Box() {
        System.out.println("Constructing BoxInheritance");
        width = 10;
        height = 10;
        depth = 10;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String args[]) {
        // declare, allocate, and initializa BoxInheritance objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;
        // get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        // get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}
