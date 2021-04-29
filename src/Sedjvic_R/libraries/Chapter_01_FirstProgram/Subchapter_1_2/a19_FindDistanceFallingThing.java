// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.22. Напишите программу, которая получает числа типа double х0, v0 и t в аргументах
//командной строки и выводит значение х0 + v0t - g t2/ 2, где g — константа
//9,80665. (Примечание: значение определяет путь в метрах, пройденный за t секунд
//брошенным вертикально вверх объектом, из исходной позиции х0 со скоростью
//v0 метров в секунду.)

public class a19_FindDistanceFallingThing {
    public static void main(String[] args) {
        double startPositionX0 = 5;
        double speedV0 = 30;
        double time = 3;
        double ACCELERATION = 9.80665;

        double distance = startPositionX0 + speedV0*time - (ACCELERATION*Math.pow(time, 2))/2;
        System.out.println(distance);

    }
}
