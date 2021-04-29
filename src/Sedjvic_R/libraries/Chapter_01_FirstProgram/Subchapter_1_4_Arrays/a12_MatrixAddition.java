// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a12_MatrixAddition {
    public static void main(String[] args) {
        int[][] m1 = {
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };

        int[][] m2 = {
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };

        int[][] m3 = new int[3][3];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
