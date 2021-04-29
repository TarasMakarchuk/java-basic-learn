// created 18.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_14_TwoDArrayAgain {
    public static void main(String[] args) {
        int twoD [][] = new int [4][];
        twoD[0] = new int [1];
        twoD[1] = new int [2];
        twoD[2] = new int [3];
        twoD[3] = new int [4];
        int k = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                twoD[i][j] = k;
                k++;
            }

        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println("");
        }

    }
}
