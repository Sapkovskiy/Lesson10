package com.Andrey.String.Lesson10;

/**
 * Написать функцию, принимающую 2 параметра:
 * строку и слово - и возвращающую true,
 * если строка начинается и заканчивается этим словом.
 */
public class task2 {

    public static void main(String[] args) {
        String target ="Работа не волк, работа";
        String word = "работа";
        boolean a =If(target,word);
        System.out.println(a);
    }
    public static boolean If (String a,String b){
        return a.endsWith(b)&& a.startsWith(b);

    }
}
