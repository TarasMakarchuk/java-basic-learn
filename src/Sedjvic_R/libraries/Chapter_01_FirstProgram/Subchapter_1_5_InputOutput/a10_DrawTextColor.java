// created 27.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdDraw;

import java.awt.*;

public class a10_DrawTextColor {
    public static void main(String[] args) {
        StdDraw.setFont();
        StdDraw.setPenColor(StdDraw.BOOK_RED);
        StdDraw.setFont(StdDraw.getFont().deriveFont(Font.BOLD));
        StdDraw.text(0.4, 0.5, "Hello world");

        StdDraw.square(0.2, 0.8, 0.1);
        StdDraw.filledSquare(0.8, 0.8, 0.2);
        StdDraw.circle(0.8, 0.2, 0.2);
        double[] x= {.1,.2,.3,.2};
        double[] y= {.2,.3,.2,.1};
        StdDraw.filledPolygon(x,y);
        StdDraw.text(.8,.8, "white text");


    }
}
