// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.26. Полярные координаты. Напишите программу, которая
//преобразует декартовы координаты в полярные. Ваша
//программа должна получать два числа типа d o u b le в аргументах
//командной строки и выводить полярные координаты
//г и 0. Используйте метод Math.atan2(y, х) для вычисления
//арктангенса величины у/х в диапазоне от - к до к.
//phi = arctg(y/x); r =sqrt(x2 + y2);

public class a23_DeacrtCoordinatesToPolar {
    public static void main(String[] args) {
        double x = 15;
        double y = 10;

        double phi = Math.atan2(y, x);
        System.out.println("phi = " + phi);
        double polarRadius = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("polar radius = " + polarRadius);
    }
}
