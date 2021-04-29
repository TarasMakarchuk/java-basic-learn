package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 21.01.2021

//        Реализуйте метод, вычисляющий факториал заданного натурального числа.
//        Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.
//        Поскольку это очень быстро растущая функция, то даже для небольших
//        NN вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку
//        ввода-вывода добавит проверяющая система.
//        Sample Input 1:
//        1
//        Sample Output 1:
//        1
//        Sample Input 2:
//        3
//        Sample Output 2:
//        6


import java.math.BigInteger;

public class T_08_factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static BigInteger factorial(int value) {
        int count = 1;
        BigInteger factorial = new BigInteger("1");
        while (count <= value) {
            factorial = factorial.multiply(BigInteger.valueOf(count));
            count++;
        }
        return factorial;
    }
}
