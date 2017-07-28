package com.github.padlaboris.basic.Chapt8.Inheritance;

public class A1 {
    int i; // public by default
    private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// A's j is not accessible here.
class B1 extends A1 {
    int total;
    void sum() {
        total = i + j; // Error, j is not accessible here
    }
}
class Access {
    public static void main(String args[]) {
        B1 subOb = new B1();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
