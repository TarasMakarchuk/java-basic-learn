package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 14.12.2020

//        Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
//        Допустимая погрешность – 0.0001 (1E-4)
//
//        Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
//
//        В качестве примера написано заведомо неправильное выражение. Исправьте его.
//        Sample Input:
//        0.1 0.2 0.3
//        Sample Output:
//        true


public class T_03_CheckSumDoubleABC {
    public static void main(String[] args) {
        System.out.println(checkSumDoubleNumbers(0.0001, 0.0002, 0.0003));
    }

    public static boolean checkSumDoubleNumbers(double a, double b, double c) {
        int scale = 10000;
        return Math.round(a * scale) + Math.round(b * scale) == Math.round(c * scale);
    }
}
