// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;


//1.2.30. Случайные числа с равномерным распределением. Напишите программу, которая
//выводит пять случайных чисел с равномерным распределением в диапазоне
//от 0 до 1, их среднее арифметическое, минимальное и максимальное значения.
//Используйте методы Math.randomQ, Math.minQ и Math.maxQ.

public class a26_RandomNumbersEvenlyDistributed {
    public static void main(String[] args) {
        double generateNUmber1 = Math.random();
        double generateNUmber2 = Math.random();
        double generateNUmber3 = Math.random();
        double generateNUmber4 = Math.random();
        double generateNUmber5 = Math.random();

        System.out.println(generateNUmber1+ " " + generateNUmber2 + " " +generateNUmber3 + " " + generateNUmber4 + " " + generateNUmber5);

        double maxNUmber1 = Math.max(generateNUmber1, generateNUmber2);
        double maxNUmber2 = Math.max(generateNUmber2, generateNUmber3);
        double maxNUmber3 = Math.max(generateNUmber3, generateNUmber4);
        double maxNUmber4 = Math.max(generateNUmber4, generateNUmber5);

        double maxNUmber5 = Math.max(maxNUmber1,maxNUmber2);
        double maxNUmber6 = Math.max(maxNUmber2,maxNUmber3);
        double maxNUmber7 = Math.max(maxNUmber4,maxNUmber4);

        double maxNUmber8 = Math.max(maxNUmber5, maxNUmber6);
        double maxNUmber9 = Math.max(maxNUmber6, maxNUmber7);

        double maxNUmber10 = Math.max(maxNUmber8, maxNUmber9);

        System.out.println("max number = " + maxNUmber10);

        double minNUmber1 = Math.min(generateNUmber1, generateNUmber2);
        double minNUmber2 = Math.min(generateNUmber2, generateNUmber3);
        double minNUmber3 = Math.min(generateNUmber3, generateNUmber4);
        double minNUmber4 = Math.min(generateNUmber4, generateNUmber5);

        double minNUmber5 = Math.min(minNUmber1,minNUmber2);
        double minNUmber6 = Math.min(minNUmber2,minNUmber3);
        double minNUmber7 = Math.min(minNUmber4,minNUmber4);

        double minNUmber8 = Math.min(minNUmber5, minNUmber6);
        double minNUmber9 = Math.min(minNUmber6, minNUmber7);

        double minNUmber10 = Math.min(minNUmber8, minNUmber9);

        System.out.println("min number = " + minNUmber10);

        double averageArithmetic = (generateNUmber1 + generateNUmber2 + generateNUmber3 + generateNUmber4 + generateNUmber5)/5;

        System.out.println("average arithmetic = " + averageArithmetic);
    }
}
