// created 16.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a11ElectronicTableStudents {
    public static void main(String[] args) {
        double[][] array = {
                {99.0, 85.0, 98.0, 0.0},
                {98.0, 57.0, 79.0, 0.0},
                {92.0, 77.0, 74.0, 0.0},
                {94.0, 62.0, 81.0, 0.0},
                {99.0, 94.0, 92.0, 0.0},
                {80.0, 76.5, 67.0, 0.0},
                {76.0, 58.5, 90.5, 0.0},
                {92.0, 66.5, 91.0, 0.0},
                {97.0, 70.5, 66.5, 0.0},
                {89.0, 89.5, 81.0, 0.0},
                {0.0, 0.0, 0.0, 0.0},
        };

        int row = array.length;
        int col = array[0].length;

        System.out.println(row);
        System.out.println(col);

        int m = array.length;
        int n = array[0].length -1;
//        int m = 11; //row
//        int n = 3; //col

        for (int i = 0; i < m; i++) {
            double sum = 0;
            for (int j = 0; j < n; j++) {
                sum+= array[i][j];
                System.out.print(array[i][j] + " ");
            }
            array[i][n] = sum / n;
            System.out.println(array[i][n] + " ");
        }

        for (int j = 0; j < n; j++) {
            double sum = 0;
            for (int i = 0; i < m; i++) {
                sum += array[i][j];
//                System.out.print(array[i][j] + " ");
            }
            array[m-1][j] = sum / (m-1);
//            System.out.println(array[j][n] + " ");
        }

        System.out.println();


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(array[i][n] + " ");
        }
        
    }
}
