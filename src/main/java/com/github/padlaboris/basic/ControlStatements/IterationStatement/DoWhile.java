package com.github.padlaboris.basic.ControlStatements.IterationStatement;

public class DoWhile {
    public static void main(String args[]) {
        int n = 10;
        do {
            System.out.println("tick " + n);
        } while (--n > 0);
    }
}
