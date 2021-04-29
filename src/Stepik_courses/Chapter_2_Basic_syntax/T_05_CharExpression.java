package Stepik_courses.Chapter_2_Basic_syntax;// created 28.12.2020

//   Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
//   (обратный слэш) на расстоянии a.
//        В качестве примера написано заведомо неправильное выражение. Исправьте его.
//        Sample Input 1:
//        32
//        Sample Output 1:
//        |
//        Sample Input 2:
//        29
//        Sample Output 2:
//        y


import java.lang.reflect.Array;

public class T_05_CharExpression {
    public static void main(String[] args) {
        System.out.println(charExpression(32));
        System.out.println(charExpression1(32));
    }

    //v1
    public static char charExpression(int a) {
        int count = 0;
        char backSlash = "\u005c\u005c".charAt(0);

        while (count < a) {
            backSlash++;
            count++;
        }
        return backSlash;
    }

//v2

    public static char charExpression1(int a) {
        System.out.println('\\');
        System.out.println("\u005c\u005c".charAt(0));
        return (char) ('\\' + a);
    }



}
