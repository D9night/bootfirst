package com.liuxscomp.demo;

public class LiuThread  extends  Thread{
    int n = 100;
    static Integer low =0;
    @Override
    public void run() {
        while (low <= n) {
            synchronized (low) {
                System.out.println(low);
                low ++;
            }
        }

    }
}
