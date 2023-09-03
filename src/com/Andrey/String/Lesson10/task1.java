package com.Andrey.String.Lesson10;

/**
 *  Заменить все грустные смайлы в строкена веселые.
 */
public class task1 {
    public static void main(String[] args) {
        String a = "sdgoshgo :)dgfdf:(gweg wf q :( ;( :) asfafsd";
        String result=replace(a);
        System.out.println(result);
    }
    public static String replace(String a){

        return a.replace(":(",":)");
    }
}
