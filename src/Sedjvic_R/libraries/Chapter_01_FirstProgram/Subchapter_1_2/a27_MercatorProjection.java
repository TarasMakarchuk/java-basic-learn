// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

//1.2.31. Проекция Меркатора. Проекция Меркатора представляет собой равноугольную
//(сохраняющую углы между направлениями) картографическую проекцию,
//отображающую широту ф и долготу X в прямоугольные координаты (х, у).
//Проекция Меркатора широко применяется — например, в навигационных картах
//и тех картах, которые вы распечатываете из Интернета. Проекция определяется
//формулами х = X - Xq и у = 1/2 In ((1 + sin ф) / (1 - sin ф)), где Xq — долгота точки
//в центре карты. Напишите программу, которая получает в командной строке ^0,
//а также широту и долготу точки и выводит проекцию точки.

public class a27_MercatorProjection {
    public static void main(String[] args) {
        int lambdaDegree = 18;
        int lambdaDegree0 = 12;
        int phiDegree = 20;

        double rectangularCoordinateX = lambdaDegree - lambdaDegree0;
        double rectangularCoordinateY = 1.0/2.0 * Math.log((1 + Math.sin(phiDegree)) / (1 - Math.sin(phiDegree)));

        System.out.println("rectangularCoordinateX = " + rectangularCoordinateX);
        System.out.println("rectangularCoordinateY = " + rectangularCoordinateY);

    }
}


