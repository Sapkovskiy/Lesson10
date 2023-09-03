package com.Andrey.String.Lesson10;

import java.util.Arrays;

/**
 * Написать функцию, разбивающую строку на равные части
 * по n символов и сохраняющую отдельные части в массив.
 * Вывести этот массив.
 */
public class task5 {
    public static void main(String[] args) {

        String target = "Жили были 2 веселых гуся: один серый, другой белый. ";
        int n =10;
        String[] splits = split(target, n);
        System.out.println(Arrays.toString(splits));
    }
    public static String[] split(String a,int b){
        int arraysize=(int)Math.ceil(a.length()/(double)b);
        String[] result=new String[arraysize];
        int counter=0;
        for (int i = 0; i < a.length(); i+=b) {
            int endIndex= Math.min(a.length(), i + b);
            String substring = a.substring(i, endIndex);
            result[counter]=substring;
            counter++;
        }
        return result;
    }

}
