// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a16_SteppedArrays {
    public static void main(String[] args) {
        int[][] a = {
                {1,2},
                {4,5,6,7},
                {8,9,10,11,12,13,14},
                {0}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
