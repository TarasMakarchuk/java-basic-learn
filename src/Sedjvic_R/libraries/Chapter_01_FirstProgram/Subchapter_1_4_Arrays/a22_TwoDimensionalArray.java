// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//Напишите фрагмент кода для вывода содержимого двумерного массива
//boolean. В выходных данных символ * должен представлять true, а пробел — false.
//Включите индексы строк и столбцов.

import java.util.Arrays;

public class a22_TwoDimensionalArray {
    public static void main(String[] args) {
        int n = 5;
        boolean[][] matrix = new boolean[n][n];

        int n1 = 10;
        int[] a1 = new int[n1];
        a1[0] =1;
        a1[1] =1;
        for (int i = 2; i < n1; i++) {
            a1[i] = a1[i-1]+a1[i-2];
            System.out.println(i);
        }
        System.out.println(Arrays.toString(a1));



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+1) % (j+1) == 0){
                    matrix[i][j] = true;
                } else{
                    matrix[i][j] = false;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j]){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
