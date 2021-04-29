// created 26.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdDraw;

public class a05_Triangle {
    public static void main(String[] args) {
        double t = Math.sqrt(3.0)/2.0;
        System.out.println(t);
        StdDraw.setCanvasSize(500, 500);
        StdDraw.setPenColor(255, 100, 25);
        StdDraw.line(0.0, 0.0, 1.0, 0.0);
        StdDraw.line(1.0, 0.0, 0.5, t);
        StdDraw.line(0.5, t, 0.0, 0.0);
        StdDraw.setPenRadius(0.02);
        StdDraw.point(0.5, t/3.0);
        StdDraw.setPenColor(255, 20, 25);
        StdDraw.line(0.2, 0.0, 0.2, 0.4);
        StdDraw.line(0.2, 0.4, 0.8, 0.4);
        StdDraw.line(0.8, 0.4, 0.8, 0.0);
        StdDraw.line(0.2, 0.0, 0.8, 0.0);

    }
}
