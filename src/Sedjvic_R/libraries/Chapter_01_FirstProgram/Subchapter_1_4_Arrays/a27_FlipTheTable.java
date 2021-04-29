// created 18.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.14. Напишите фрагмент кода для вывода транспонированного квадратного
//двумерного массива (то есть полученного перестановкой строк и столбцов). Для
//примера таблицы, приведенного в тексте, ваш код должен выводить следующий
//результат:
//99 98 92 94 99 90 76 92 97 89
//85 57 77 32 34 46 59 66 71 29
//98 78 76 11 22 54 88 89 24 38

public class a27_FlipTheTable {
    public static void main(String[] args) {
        double[][] array = {
                {99, 85, 98},
                {98, 57, 78},
                {92, 77, 76},
                {94, 32, 11},
                {99, 34, 22},
                {90, 46, 54},
                {76, 59, 88},
                {92, 66, 89},
                {97, 71, 24},
                {89, 29, 38}
        };

        for (int i = 0; i < array[0].length; i++) {
            double [][] b = new double[array[0].length][array.length];
            for (int j = 0; j < array.length; j++) {
                b[i][j] = array[j][i];
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
