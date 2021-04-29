// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.20. Напишите программу, которая выводит сумму двух случайных чисел от 1 до
//6 (такие результаты могут быть получены при броске кубиков).

public class a17_RandomIntFrom1To6 {
    public static void main(String[] args) {
        int result = (int) (Math.random() * (6) + 1);
        System.out.println(result);
    }
}
