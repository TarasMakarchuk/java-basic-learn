// created 19.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a29_EratosthenesTable_v2 {
    public static void main(String[] args) {
        int n = 9;
        boolean[][] table = new boolean[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                table[i][j] = true;
            }
        }

        //todo do write
        for (int i = 2; i <=n/2 ; i++) {
            for (int j = 2; j <=n/2 ; j++) {

                if(table[i][j]){
                    for (int k = 1; k <=n ; k++) {
                        for (int m = 1; m <=n ; m++) {
                            System.out.println(" [i * j][k] " + i * j + " " + k);
                            table[i*j][k] = false;
                            System.out.println(" [m][i * j] " + m + " " + i * j);
                            table[k][i*j] = false;

                        }
                    }
                }
            }
        }



        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }

    }
}
