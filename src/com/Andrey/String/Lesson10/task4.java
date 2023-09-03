package com.Andrey.String.Lesson10;

/**
 * Подсчитать количество всех точек,запятых и восклицательных знаков в строке.
 */
public class task4 {
    public static void main(String[] args) {
        String target ="Я ,если вспомнить, от дедушки ушел. Я от бабушки ушел. И от тебя уйду!!!";
        int result1=result(target);
        System.out.println(result1);
    }

    private static int result(String target) {
        String resultS = target.replace(",", "")
                .replace(".", "")
                .replace("!", "");
        return (target.length() - resultS.length());
    }
}
