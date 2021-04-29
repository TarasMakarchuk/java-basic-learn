// created 22.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdOut;

public class a00_Theory {
    public static void main(String[] args) {
        StdOut.printf("Pi is approximately %.2f \n", Math.PI);

        String formats = "%3s %6.2f %7.2f %5.2f \n";
//        StdOut.printf(formats, month[i], pay, balance, interest);
        StdOut.printf(formats, "February", 100.0, 999.0, 1.235);

        int a = 512;
        StdOut.printf("%14d \n" , a);
        StdOut.printf("%-14d \n", a);

        double d = 1595.239482934;
        StdOut.printf("%14.2f \n", d);
        StdOut.printf("%.7f \n", d);
        StdOut.printf("%14.4e \n", d);

        String s = "Hello world";
        StdOut.printf("%14s \n", s);
        StdOut.printf("%-14s \n", s);
        StdOut.printf("%-14.5s \n", s);

        boolean b = true;
        StdOut.printf("%b \n", b);
    }
}
