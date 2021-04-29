// created 22.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.3. Вычисление среднего арифметического для числового потока

import Sedjvic_R.libraries.StdOut;


public class a03_Average {
    public static void main(String[] args) {
        double sum = 0.0;
        double n = 0.0;
        while (!StdIn.isEmpty()) {
            double value = StdIn.readDouble();
            sum += value;
            n++;
        }
        double average = sum / n;
        StdOut.println("average is " + average);
    }
}
