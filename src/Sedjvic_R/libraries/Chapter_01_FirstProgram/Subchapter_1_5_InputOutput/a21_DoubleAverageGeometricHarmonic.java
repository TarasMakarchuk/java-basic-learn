// created 05.04.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.8. Напишите программу, которая читает положительные числа с плавающей
//точкой из стандартного ввода и выводит их средние геометрические и гармонические
//значения. Среднее геометрическое п положительных чисел х ]} х2 У хп вычисляется
//по формуле (*! х х2 х ... х хп) {/п. Среднее гармоническое вычисляется по
//формуле п / ( \ / х х + \ /х 2 + ... + \ /х п). Подсказка: при вычислении среднего геометрического
//используйте логарифм, чтобы избежать переполнения.

public class a21_DoubleAverageGeometricHarmonic {
    public static void main(String[] args) {
        String str = "";
        while (!StdIn.isEmpty()) {
            double n = StdIn.readDouble();
            str += n + " ";
        }

        String[] strArr = str.split(" ");
        double[] doubleArr = new double[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            doubleArr[i] = Double.parseDouble(strArr[i]);
        }

        double averageGeometric = 1;
        for (int i = 0; i < doubleArr.length; i++) {
            averageGeometric *= doubleArr[i];
        }
        averageGeometric = Math.pow(averageGeometric, 1.0 / doubleArr.length);
        System.out.println("averageGeometric: " + averageGeometric);

        double averageHarmonic = 0.0;
        for (int i = 0; i < doubleArr.length; i++) {
            averageHarmonic += 1 / doubleArr[i];
        }
        averageHarmonic = doubleArr.length / averageHarmonic;
        System.out.println("averageHarmonic: " + averageHarmonic);
    }
}
