// created 19.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.18. Напишите фрагмент кода для умножения двух прямоугольных матриц, которые
//не обязаны быть квадратными. Примечание: чтобы скалярное произведение
//вычислялось корректно, количество столбцов в первой матрице должно совпадать
//с количеством строк во второй матрице. Если размеры матриц не удовлетворяют
//этому условию, выведите сообщение об ошибке.

// |a1,a2,a3|   |c1,d1,e1,f1|    |a1c1 + a2c2 +a3c3, a1d1+a2d2+a3d3, a1e1+a2e2+a3e3, a1f1+a2f2+a3f3|
// |b1,b2,b3| * |c2,d2,e2,f2| == |b1c1 + b2c2 +b3c3, b1d1+b2d2+b3d3, b1e1+b2e2+b3e3, b1f1+b2f2+b3f3|
//              |c3,d3,e3,f3|


public class a31_MultiplicationRectangularMatrices {
    public static void main(String[] args) {
        int[][] a = {
                {10,11,12},
                {20,21,22},
                {30,41,52}
        };

        int[][] b = {
                {1,2},
                {3,4},
                {5,6}
        };

        int[][] c = new int[a.length][b.length];

        System.out.println(a.length);
        System.out.println(a[0].length);
        System.out.println(b.length);
        System.out.println(b[0].length);


        if(a[0].length != b.length){
            System.out.println("error");
        } else {
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    for (int k = 0; k < a[i].length ; k++) {
                        c[i][j] += a[i][k]* b[k][j];
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length ; j++) {
                    System.out.print(c[i][j]+ " ");
                }
                System.out.println();
            }
        }
    }
}
