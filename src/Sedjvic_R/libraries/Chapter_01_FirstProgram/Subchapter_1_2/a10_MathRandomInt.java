// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.19. Напишите программу, которая получает два целых числа а и b в аргументах
//командной строки и выводит случайное целое число из диапазона от а до b включительно.

public class a10_MathRandomInt {
    public static void main(String[] args) {
        int a = 20;
        int b = 13;

        int i = 0;
        while (i < 100){
            int result = (int) (Math.random() * Math.abs(a - b) + Math.min(a, b));
            System.out.println(result);
            i++;
        }

    }
}
