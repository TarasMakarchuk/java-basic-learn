// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.15. Напишите программу, которая получает три положительных числа в аргументах
//командной строки и выводит f a ls e , если одно из них больше или равно
//сумме других, или t r u e в противном случае. (Примечание: программа проверяет,
//могут ли числа представлять длины сторон некоторого треугольника.)

public class a15_CheckedSumArguments {
    public static void main(String[] args) {
        int a =25;
        int b =4;
        int c =5;

        boolean result = (a >= b+c);
        System.out.println(result);

    }
}
