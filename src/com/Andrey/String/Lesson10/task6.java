package com.Andrey.String.Lesson10;

public class task6 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder a= new StringBuilder();
        for (int i = 0; i < 100_000; i++) {
            a.append(i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("Time: "+(endTime-startTime));
    }
}
