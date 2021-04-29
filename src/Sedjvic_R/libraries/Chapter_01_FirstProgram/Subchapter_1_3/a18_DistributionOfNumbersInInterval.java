// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.10. Напишите программу, которая получает целое число п как аргумент командной
//строки, использует M a th . ran dom() для вывода п случайных значений с равно-
//мерным распределением в интервале от 0 до 1, после чего выводит их среднее
//значение (см. упражнение 1.2.30).

//1.2.30. Случайные числа с равномерным распределением. Напишите программу, которая
//выводит пять случайных чисел с равномерным распределением в диапазоне
//от 0 до 1, их среднее арифметическое, минимальное и максимальное значения.
//Используйте методы Math.randomQ, Math.minQ и Math.maxQ.

public class a18_DistributionOfNumbersInInterval {
    public static void main(String[] args) {
        int n = 10;

        double sumRandomNumbers = 0;

        for (int i = 0; i < n; i++) {
            double randomNUmber = Math.random();
            sumRandomNumbers += randomNUmber;
        }

        System.out.println(sumRandomNumbers/n);
    }
}
