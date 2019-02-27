package com.liuxscomp.demo;

public class TestMain {

    public static void main(String[] args) {
        Thread t1 = new LiuThread();
        Thread t2 = new LiuThread();
        t1.start();
        t2.start();
    }
}
