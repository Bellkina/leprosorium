package com.github.padlaboris.basic.Chapt8.Inheritance.Overriding;

public class A1 {
    int i, j;

    A1(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending class A.
class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override1 {
    public static void main(String args[]) {
        B1 subOb = new B1(1, 2, 3);

        subOb.show("This is k: "); // this calls show() in B1
        subOb.show(); // this calls show() in A1
    }
}