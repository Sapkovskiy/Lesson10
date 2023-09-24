package com.Andrey.String.Lesson10;

/**
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
public class HomeWorkTask2 {

    public static void main(String[] args) {
        String Rom="IIMMXXV";

        System.out.println("Rom= "+Rom+" Arab= "+translator(Rom));
    }

    private static int translator(String a) {
        int firstCharacter= arabic(a.charAt(a.length()-1));
        int result=firstCharacter;
        for (int i = a.length()-2; i >=0 ; i--) {
            int corentlyValue=arabic(a.charAt(i));
            result+=corentlyValue<firstCharacter?-corentlyValue:corentlyValue;

        }
        return result;

    }

    private static int arabic(char charAt) {

        return switch (charAt){
            case 'I'-> 1;
            case 'V'->5;
            case 'X'->10;
            case 'L'->50;
            case 'C'->100;
            case 'D'->500;
            case 'M'->1000;
            default -> 0;

        };

    }
}
