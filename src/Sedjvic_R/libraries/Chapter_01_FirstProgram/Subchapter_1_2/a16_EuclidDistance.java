// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.18. Напишите программу, которая получает два числа с плавающей точкой х и у
//в аргументах командной строки и выводит евклидово расстояние от точки (х, у)
//до точки (0,0).

public class a16_EuclidDistance {
    public static void main(String[] args) {
        double xa = 10.1;
        double ya = 15.2;

        double xb = 0;
        double yb = 0;

        double distance = Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));

        System.out.println(distance);

    }
}
