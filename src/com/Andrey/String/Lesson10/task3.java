package com.Andrey.String.Lesson10;

/**
 * Написать функцию, принимающую в качестве параметров имя,
 * фамилию и отчество и возвращающую инициалы. Ф.И.О.
 * Учесть, что входные параметры могут быть в любом регистре
 * ,а результирующая строка только в верхнем.
 */
public class task3 {
    public static void main(String[] args) {
        String Name="Андрей";
        String Surname="Абражей";
        String Name2="Михайлович";
        String a=NSN(Name,Surname,Name2);
        System.out.println(a);
    }

    private static String NSN(String name, String surname, String name2) {
        char c =Character.toUpperCase(surname.charAt(0));
        char c1 = Character.toUpperCase(name.charAt(0));
        char c2 = Character.toUpperCase(name2.charAt(0));

        return String.format("%s.%s.%s",c,c1,c2);

    }
}
