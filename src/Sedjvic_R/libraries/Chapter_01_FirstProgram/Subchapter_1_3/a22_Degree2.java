// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.16. Напишите программу, которая получает целое число п как аргумент
//командной строки и выводит все положительные степени 2, меньшие или равные п.
//Убедитесь в том, что ваша программа правильно работает для всех значений п.


public class a22_Degree2 {
    public static void main(String[] args) {
        int n = 16;
        for (int i = 0; i <= n; i++) {
            System.out.println(Math.pow(2, i));
        }
    }
}