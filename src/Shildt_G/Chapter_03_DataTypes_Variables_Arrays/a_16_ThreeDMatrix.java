// created 18.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_16_ThreeDMatrix {
    public static void main(String[] args) {
        int threeD[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threeD[i][j][k] = i * j * k;
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
