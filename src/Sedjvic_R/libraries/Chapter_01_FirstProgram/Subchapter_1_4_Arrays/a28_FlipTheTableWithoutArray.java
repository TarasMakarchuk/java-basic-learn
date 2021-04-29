// created 18.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.15. Напишите фрагмент кода для транспонирования квадратного двумерного
//массива «на месте» без создания второго массива.

public class a28_FlipTheTableWithoutArray {
    public static void main(String[] args) {
        double[][] array = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
//                {94, 32, 11},
//                {99, 34, 22},
//                {90, 46, 54},
//                {76, 59, 88},
//                {92, 66, 89},
//                {97, 71, 24},
//                {89, 29, 38}
        };

        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[j][i] = array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
