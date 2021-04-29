// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a13_ScalarRowMultiplication {
    public static void main(String[] args) {
        double[][] a = {
                {.7, .2, .1},
                {.3, .6, .1},
                {.5, .1, .4}
        };

        double[][] b = {
                {.2, .3, .5},
                {.1, .2, .1},
                {.1, .3, .4}
        };

        double[][] c = new double[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length ; j++) {
                System.out.print(Math.round((c[i][j])*100.0)/100.0+" ");
            }
            System.out.println();
        }
    }
}
