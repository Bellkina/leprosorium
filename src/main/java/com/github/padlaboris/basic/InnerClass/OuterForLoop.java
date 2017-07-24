package com.github.padlaboris.basic.InnerClass;

public class OuterForLoop {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("display: outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

class InnerClassDemo1 {
    public static void main(String args[]) {
        OuterForLoop outer = new OuterForLoop();
        outer.test();
    }
}
