package com.github.padlaboris.basic.INTRFC;

class AnotherClient implements Callback {
    @Override
    public void callback(int param) {
        System.out.println("Another version of callback");
        System.out.println("param squared is " + (param * param));
    }
}
