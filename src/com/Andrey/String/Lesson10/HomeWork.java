package com.Andrey.String.Lesson10;

import java.sql.SQLOutput;

/**
 * Занятие 10.3. Строки. Домашнее задание.
 *
 * 1. Проверить, является ли введённая строка палиндромом, т.е. читается одинаково в обоих направлениях
 * 2. Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * Например CM == 900.
 * Соответствие:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class HomeWork {
    private static final String EMPTY ="";
    private static final String SPASE =" ";

    public static void main(String[] args) {
     //   replacement();
     //   System.out.println(replacement());
        String a ="а роза упала на лапу Азора";
        System.out.println(equalse(a));

    }
    private static boolean equalse (String a){
        String b = a.replace(SPASE,EMPTY);
        StringBuilder g = new StringBuilder(b);
        StringBuilder r =g.reverse();
        boolean s =r.toString().equalsIgnoreCase(b);
        return s;
    }

    private static boolean replacement() {
        String line = "1234321";
        String lineCopy ="";
        int j=0;
        for (int i = line.length()-1; i >=0; i--) {

            char a = line.charAt(i);
            j++;
            lineCopy= lineCopy+a;
        }
        if (line.equals(lineCopy)){
            return true;
        }else return false;

    }
}
