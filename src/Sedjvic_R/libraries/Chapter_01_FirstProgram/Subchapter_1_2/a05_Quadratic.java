// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

public class a05_Quadratic {
    public static void main(String[] args) {
        double b = -3;
        double c = 2;
        double discriminant = b*b - 4*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b+d)/2);
        System.out.println((-b-d)/2);
    }
}
