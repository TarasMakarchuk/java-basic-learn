// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.2. Напишите программу, которая использует Math.sin() и Math.cos() и проверяет,
//что значение cos2 0 + sin2 0 равно приблизительно 1 для любого значения 0(фи),
//переданного в аргументе командной строки. Просто выведите значение. Почему
//оно не всегда в точности равно 1?


public class a07_SinCosPhi {
    public static void main(String[] args) {
        double phi = Math.random()*10;
        double sin2Phi = Math.pow(Math.sin(phi), 2);
        double cos2Phi = Math.pow(Math.cos(phi), 2);
        boolean compare = sin2Phi + cos2Phi == 1;

        System.out.println(sin2Phi);
        System.out.println(cos2Phi);
        System.out.println(sin2Phi + cos2Phi);
        System.out.println();
        System.out.println(compare);

    }
}
