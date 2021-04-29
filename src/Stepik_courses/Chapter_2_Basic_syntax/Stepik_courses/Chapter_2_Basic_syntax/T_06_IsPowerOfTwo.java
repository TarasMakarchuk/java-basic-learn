package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 12.01.2021

//        Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
//        Решать можно разными способами:
//        воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
//        применив пару трюков из двоичной арифметики;
//        написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после
//        просмотра соответствующих уроков).
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
//        добавит проверяющая система.
//
//        Sample Input 1:
//        0
//        Sample Output 1:
//        false

//        Sample Input 2:
//        1
//        Sample Output 2:
//        true

//        Sample Input 3:
//        -2
//        Sample Output 3:
//        true

public class T_06_IsPowerOfTwo {
    public static void main(String[] args) {
        int number = 11111;
        System.out.println(isPowerOfTwo(number));
        System.out.println(isPowerOfTwo1(number));
    }

    public static boolean isPowerOfTwo(int value) {

        System.out.println(('A' + "12").getClass().getName());
        System.out.println(("A"+ 12).getClass().getName());
        System.out.println('A'+ '1' + "2");
        System.out.println('A'+ ('\t' + "\u0003"));
        double absValue = Math.abs(value);
        if (absValue == 1) {
            return true;
        }
        while (absValue > 2) {
            absValue = absValue / 2;
        }
        return absValue == 2;
    }

    public static boolean isPowerOfTwo1(int value) {
        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
