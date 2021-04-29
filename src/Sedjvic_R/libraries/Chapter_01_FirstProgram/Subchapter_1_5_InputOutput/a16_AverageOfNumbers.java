// created 29.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//1.5.3. Напишите программу, которая получает целое число п как аргумент командной
//строки, читает п чисел с плавающей точкой из стандартного ввода и выводит
//их математическое ожидание (среднее арифметическое) и среднеквадратичное
//отклонение (квадратный корень из суммы квадратов разностей с математическим
//ожиданием, деленной на п-1).

import java.util.Arrays;

public class a16_AverageOfNumbers {
    public static void main(String[] args) {
        String str = "";
        while (!StdIn.isEmpty()){
            double n = StdIn.readDouble();
            str += n + " ";
        }

        String[] strArr = str.split(" ");
        System.out.println(Arrays.toString(strArr));

        double[] numArr = new double[strArr.length];
        double averageArithmetic = 0.0;

        int n = numArr.length;
        for (int i = 0; i < n; i++) {
            numArr[i] = Double.parseDouble(strArr[i]);
            averageArithmetic += numArr[i];
        }
        averageArithmetic = averageArithmetic/n;

        double resultQuadratic = 0.0;
        double deviation = 0.0;
        for (int i = 0; i < n; i++) {
            deviation += Math.pow((numArr[i] - averageArithmetic), 2);
            System.out.println("deviation[i] "+deviation);
        }
        resultQuadratic = Math.sqrt(deviation / n);

        System.out.println("average arithmetic: " + averageArithmetic);
        System.out.println("average quadratic: " + resultQuadratic);
    }
}


