// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a06_HarmonicNumbers {
    public static void main(String[] args) {
        int n =15;
        double[] harmonic = new double[n];
        for (int i = 1; i < n; i++) {
            harmonic[i] = harmonic[i-1] + 1.0/i;
            System.out.println(harmonic[i] + "\t " + (harmonic[i] - harmonic[i-1]));
        }


    }
}
