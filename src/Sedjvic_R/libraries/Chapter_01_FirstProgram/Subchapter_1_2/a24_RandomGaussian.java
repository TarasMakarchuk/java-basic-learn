// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.27. Случайные числа с гауссовским (нормальным) распределением.
//Напишите программу RandomGaussian для вывода случайного числа
//г из гауссовского распределения. Для этого можно воспользоваться формулой
//Бокса — Мюллера
//r = sin(2 я v) (-2 In м)1/2,
//где и и v — вещественные числа в диапазоне от 0 до 1, сгенерированные методом
//Math.random().

public class a24_RandomGaussian {
    public static void main(String[] args) {
        double randomV = Math.random();
        double randomU = Math.random();

        System.out.println(randomV +" "+ randomU);

        double randomGaussian = Math.sin(2*Math.PI* randomV)*Math.pow((-2*Math.log(randomU)), 1/2);

        System.out.println(randomGaussian);
    }
}
