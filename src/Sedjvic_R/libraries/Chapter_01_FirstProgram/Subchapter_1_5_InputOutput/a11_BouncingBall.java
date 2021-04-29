// created 27.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.6 . Столкновения шара

import Sedjvic_R.libraries.StdDraw;

public class a11_BouncingBall {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        double rx= 0.48, ry = 0.86;
        double vx= 0.025, vy = 0.021;
        double radius = 0.055;
        int r = 100, g = 100, b = 100;
        StdDraw.enableDoubleBuffering();
        while (true){
            if(Math.abs(rx+ vx) + radius > 1.0){
                vx = -vx;
            }
            if(Math.abs(ry+vy) + radius > 1.0){
                vy = -vy;
            }
            if(r >= 255){
                r = (int) Math.floor(Math.random()*255);
            } else if( g >= 255){
                g = (int) Math.floor(Math.random()*255);

            } else if(b >= 254){
                b = (int) Math.floor(Math.random()*255);
            }
            System.out.println(b);
            StdDraw.setPenColor(r++, g++, b++);
            rx += vx;
            ry += vy;
            StdDraw.clear();
            StdDraw.filledCircle(rx, ry, radius);
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
