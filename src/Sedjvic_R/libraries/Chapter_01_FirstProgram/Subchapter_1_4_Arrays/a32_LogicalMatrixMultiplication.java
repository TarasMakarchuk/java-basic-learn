// created 20.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.19. Напишите программу для «логического умножения» двух квадратных
//матриц с элементами boolean. Используйте операции логического OR вместо +
//и логического AND вместо *.

public class a32_LogicalMatrixMultiplication {
    public static void main(String[] args) {
        boolean[][] a = {
                {false, false, false},
                {false, true, false},
                {true, false, true}
        };

        boolean[][] b = {
                {false, true, false},
                {true, false, true},
                {false, true, false}
        };

        boolean[][]c = new boolean[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < a[i].length; k++) {
                    c[i][j] |= a[i][j] & b[k][j];
                }
            }
        }

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length ; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
