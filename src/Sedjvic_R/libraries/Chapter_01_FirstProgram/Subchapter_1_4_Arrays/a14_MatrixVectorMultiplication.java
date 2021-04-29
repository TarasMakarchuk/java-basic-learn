// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a14_MatrixVectorMultiplication {
    public static void main(String[] args) {
        int[][] a = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
                {94, 32, 11},
                {99, 34, 22},
                {90, 46, 54},
                {76, 59, 88},
                {92, 66, 89},
                {97, 71, 24},
                {89, 29, 38}
        };
        double[] x = {
               .3334,
               .3334,
               .3334
        };

        double [] b = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[i] += a[i][j] * x[j];
            }
        }

        for (int i = 0; i < a.length; i++) {
                System.out.println(Math.floor(b[i]) + " ");
            }
        }

    }
