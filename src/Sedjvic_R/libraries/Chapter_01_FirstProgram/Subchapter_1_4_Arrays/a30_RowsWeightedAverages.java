// created 19.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.17. Измените фрагмент кода электронной таблицы в тексте, чтобы вычислить
//средневзвешенные значения по строкам; веса оценок задаются одномерным массивом
//weights[]. Например, чтобы последний из трех экзаменов в нашем примере
//имел вдвое больший вес, чем первые два, используется массив
//doublet[] weights = { 0.25, 0.25, 0.50 };
//Обратите внимание: сумма весов должна быть равна 1.


public class a30_RowsWeightedAverages {
    public static void main(String[] args) {
        int[][] a = {
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

        double[] weight = {0.25, 0.25, 0.50};

        double[][] b = new double[a.length][weight.length+1];

        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                b[i][j] = a[i][j]*weight[j];
                sum += a[i][j]*weight[j];
                b[i][weight.length] = sum;
            }
            sum = 0;
        }


        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j <b[i].length ; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
