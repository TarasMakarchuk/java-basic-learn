// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a07_Sqrt {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double EPSILON = 1e-15;
        double t = n;
        while(Math.abs(t-n/t) > EPSILON * t){
            t = (n/t + t)/ 2.0;
        }

        System.out.println(t);

    }
}
