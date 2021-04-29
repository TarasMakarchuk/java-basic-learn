// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//Листинг 1.4.1. Случайная выборка без замены
//Программа Sample (листинг 1.4.1) демонстрирует формирование выборки с применением
//операции, лежащей в основе случайной перестановки из предыдущего раздела.
//Программа получает два аргумента командной строки n и m и создает случайную
//перестановку длины п (для множества целых чисел от 0 до п-1); первые m элементов
//образуют случайную выборку.

public class a04_RandomSimplingWithoutReplacement {
    public static void main(String[] args) {
        int m = 50;
        int n = 52;
        int [] perm = new int[n];

        for (int i = 0; i < n; i++) {
            perm[i] = i;
        }

        for (int i = 0; i < m; i++) {
            int random = i + (int) (Math.random() * (n-i));
            int temp = perm[random];
            perm[random] = perm[i];
            perm[i] = temp;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
        }

    }
}
