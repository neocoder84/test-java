package com.manas;

public class Hello {
    public static void main(String[] args) {
        for (int i = 0 ;i < 10 ; i++){
            Runnable r = () ->{
                System.out.println("inside thread");
            };
            Thread th = new Thread(r);
            th.start();
        }
    }
}
