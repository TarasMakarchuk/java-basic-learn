// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.3. Для двух заданных векторов длины п, представленных одномерными массивами,
//напишите фрагмент кода для вычисления евклидова расстояния между
//ними (квадратный корень из суммы квадратов разностей между соответствующими
//элементами).


public class a20_EuclidDistance {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {25,20,15,7};
        double[] c = new double[a.length];

        int sumMathPow = 0;
        for (int i = 0; i < a.length; i++) {
            sumMathPow += Math.pow(a[i] - b[i],2);
        }
        System.out.println(Math.sqrt(sumMathPow));
    }
}
