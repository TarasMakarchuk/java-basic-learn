// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.21. Напишите программу, которая получает число t в аргументе командной
//строки и выводит значение sin(2t) + sin(3t).

public class a18_Sin2tSin3t {
    public static void main(String[] args) {
        int t = 15;
        double result = Math.sin(2*t) + Math.sin(3*t);
        System.out.println(result);
    }
}
