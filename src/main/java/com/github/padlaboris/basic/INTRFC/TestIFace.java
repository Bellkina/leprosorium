package com.github.padlaboris.basic.INTRFC;

public class TestIFace {
    public static void main(String args[]) {
        Callback c = new Client();
        c.callback(42);
    }
}
