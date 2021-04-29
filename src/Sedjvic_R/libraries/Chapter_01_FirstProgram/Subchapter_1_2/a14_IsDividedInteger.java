// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.14. Напишите программу, которая получает два положительных числа в аргументах
//командной строки и выводит t r u e , если одно из этих чисел нацело делится
//на другое.

public class a14_IsDividedInteger {
    public static void main(String[] args) {
        int a = 11;
        int b = 3;

        boolean result = a % b == 0;
        System.out.println(result);
    }
}
