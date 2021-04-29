// created 27.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdDraw;

public class a09_Figures {
    public static void main(String[] args) {
        StdDraw.circle(0.5, 0.5, 0.1);
//        StdDraw.setPenColor(255, 100, 50);
        StdDraw.filledCircle(0.7, 0.7, 0.05);
        StdDraw.square(0.7, 0.7, 0.1);
        StdDraw.square(0.7, 0.7, 0.1);

        StdDraw.rectangle(0.3, 0.3, 0.1, 0.1);
        StdDraw.filledRectangle(0.1, 0.1, 0.1, 0.1);

        double[] x= {0.5, 0.1, 0.5, 0.8};
        double[] y= {0.5, 0.8, 0.9, 0.75};

        StdDraw.setPenColor(255, 100, 50);
        StdDraw.polygon(x, y);
    }
}
