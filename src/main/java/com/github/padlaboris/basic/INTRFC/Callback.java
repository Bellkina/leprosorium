package com.github.padlaboris.basic.INTRFC;

 class Client implements Callback  {
     @Override
     public void callback(int param) {
         System.out.println("callback called with " + param);
     }
 }
