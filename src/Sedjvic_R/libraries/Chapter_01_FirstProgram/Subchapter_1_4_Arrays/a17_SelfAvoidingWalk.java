// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//c.128 Пример: случайные блуждания без самопересечений

public class a17_SelfAvoidingWalk {
    public static void main(String[] args) {
        int n = 20;
        int trials = 200;
        int deadEnds = 0;

        for (int t = 0; t < trials; t++) {
            boolean[][] a = new boolean[n][n];
            int x = n / 2;
            int y = n / 2;
            while (x > 0 && x < n - 1 && y > 0 && y < n - 1) {
                a[x][y] = true;
                if (a[x + 1][y] && a[x - 1][y] && a[x][y + 1] && a[x][y - 1]) {
                    deadEnds++;
                    break;
                }
                double random = Math.random();
                if (random < 0.25) {
                    if (!a[x + 1][y]) {
                        x++;
                    }
                } else if (random < 0.5) {
                    if (!a[x - 1][y]) {
                        x--;
                    }
                } else if (random < 0.75) {
                    if (!a[x][y + 1]) {
                        y++;
                    }
                } else if (random < 1.0) {
                    if (!a[x][y - 1]) {
                        y--;
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j]) {
                        System.out.print("o");
                    } else if(i == n-1){
                        System.out.print("/");
                    } else if(i == 0){
                        System.out.print("\\");
                    }
                    else if(j == 0){
                        System.out.print("|");
                    }else if(j == n-1){
                        System.out.print("|");
                    }

                    else{
                        System.out.print('.');
                    }
                }
                System.out.println();
            }

        }
        System.out.println(100 * deadEnds / trials + "% dead ends");
    }
}
