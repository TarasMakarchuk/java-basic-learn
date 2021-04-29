// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.20. Используя метод Ньютона, разработайте программу, которая получает два
//целых числа пик как аргументы командной строки и выводит корень k-й степени
//из п. (Подсказка: см. упражнение 1.3.19.)


public class a25_AnyRootNewton {
    public static void main(String[] args) {
        double n1 = 625.00;
        double n = n1 - Math.pow(n1, 2) / (2 * n1);
        while (Math.abs(n - n1) >= 0.35) {
            n1 = n;
            n = n1 - Math.pow(n1, 2) / (2 * n1);
            System.out.println(n);
        }
    }
}
