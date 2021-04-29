// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1*4.12. Напишите программу DiscreteDistribution, которая получает переменное
//количество целочисленных аргументов командной строки и выводит целое число i
//с вероятностью, пропорциональной i -му аргументу командной строки.

public class a25_DiscreteDistribution {
    public static void main(String[] args) {
        int n = (int) (Math.random() * 20 + 1);
        System.out.println(n);

        int[] a = new int[n];

        int total = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            total += a[i];
//            System.out.print(a[i] + " ");
        }

        int random = (int) (Math.random() * total);

        int sum = 0;
        int probability = 0;
        for (int i = 0; i < a.length && sum <= random; i++) {
            sum += a[i];
            probability = i;
        }

        System.out.println(probability);
    }
}
