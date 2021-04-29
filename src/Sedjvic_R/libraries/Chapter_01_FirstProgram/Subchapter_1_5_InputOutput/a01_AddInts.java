// created 20.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdOut;

public class a01_AddInts {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value = StdIn.readInt();
            sum +=value;
        }
        String format = "sum is %5d \n";
        StdOut.printf(format, sum);
    }
}
