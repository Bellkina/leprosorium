package com.github.padlaboris.basic;

public class Continuelabel {
    public static void main(String args[]) {
        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.println(" " + (i * j));
            }
        }
        System.out.println();
    }
}
