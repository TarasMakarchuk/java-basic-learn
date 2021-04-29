// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a15_VectorMatrixMultiplication {
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

        double[] y = {.1, .1, .1, .1, .1, .1, .1, .1, .1, .1};

        double c [] = new double[3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 10; i++) {
                c[j] += y[i]*a[i][j];
            }
            System.out.print(Math.floor(c[j])+" ");
        }

//        for (int i = 0; i < c.length; i++) {
//            System.out.println(c[i]);
//        }

    }
}
