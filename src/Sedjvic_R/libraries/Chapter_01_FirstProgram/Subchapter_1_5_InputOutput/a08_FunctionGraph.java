// created 26.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdDraw;

public class a08_FunctionGraph {
    public static void main(String[] args) {
        int n = 10200;
        double[] x = new double[n+1];
        double[] y = new double[n+1];

        StdDraw.enableDoubleBuffering();
        for (int i = 0; i <= n; i++) {
            x[i] = Math.PI * i/n;
        }
        for (int i = 0; i <=n ; i++) {
            y[i] = Math.sin(4*x[i]) + Math.sin(20*x[i]);
        }
        StdDraw.setXscale(0, Math.PI);
        StdDraw.setYscale(-3.0, 3.0);

        for (int i = 1; i <= n; i++) {
            StdDraw.line(x[i-1], y[i-1], x[i], y[i]);
        }
        StdDraw.show();
    }
}
