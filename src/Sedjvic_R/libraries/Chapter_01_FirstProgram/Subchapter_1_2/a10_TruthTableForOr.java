// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

public class a10_TruthTableForOr {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a ^ b);
        System.out.println(a ^ a);
        System.out.println(b ^ b);
        System.out.println();

        System.out.println(!a ^ b);
        System.out.println(!a ^ a);
        System.out.println(!b ^ b);
        System.out.println();

        System.out.println(a ^ !b);
        System.out.println(a ^ !a);
        System.out.println(b ^ !b);
        System.out.println();

        System.out.println(!a ^ !b);
        System.out.println(!a ^ !a);
        System.out.println(!b ^ !b);
        System.out.println();

        System.out.println(!(a ^ b));
        System.out.println(!(a ^ a));
        System.out.println(!(b ^ b));
        System.out.println();

    }
}
