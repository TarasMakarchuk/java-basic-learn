// created 26.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdDraw;

public class a06_DrawArc {
    public static void main(String[] args) {
        int n = 50;
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        for (int i = 0; i < n; i++) {
            StdDraw.line(0, n-i, i, 0);
        }
    }
}
