package com.github.padlaboris.basic;

public class Return {
    public static void main(String args[]) {
        boolean t = true;
        System.out.println("Before the return.");
        if (t) return; // return t caller
        System.out.println("This won't execute.");
    }
}
