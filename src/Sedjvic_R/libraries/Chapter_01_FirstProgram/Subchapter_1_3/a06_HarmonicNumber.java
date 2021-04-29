// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a06_HarmonicNumber {
    public static void main(String[] args) {
        int n = 1000000;
        double harmonic = 0;
        for (int i = 1; i <= n; i++) {
            harmonic += 1.0/i;
        }
        System.out.println(harmonic);

        //v2 очность только до 6го знака!!
        double sum = Math.log(n) + 0.57721;
        System.out.println(sum);
    }
}
