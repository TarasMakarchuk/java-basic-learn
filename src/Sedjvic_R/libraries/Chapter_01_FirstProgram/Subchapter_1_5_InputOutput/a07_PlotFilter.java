// created 26.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.5. Преобр азов ание стандартного ввода в графику

import Sedjvic_R.libraries.StdDraw;

public class a07_PlotFilter {
    public static void main(String[] args) {
        double x0 = StdIn.readDouble();
        double y0 = StdIn.readDouble();
        double x1 = StdIn.readDouble();
        double y1 = StdIn.readDouble();
        StdDraw.setCanvasSize(1000, 900);
        StdDraw.setXscale(x0, x1);
        StdDraw.setYscale(y0, y1);

        while (!StdIn.isEmpty()){
            double x = StdIn.readDouble();
            double y = StdIn.readDouble();
            StdDraw.point(x, y);
        }
    }
}
