// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

public class a04_IntOps {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = a*b;
        int q = a/b;
        int r= a%b;
        System.out.println(a+ " * " + b + " = " + p);
        System.out.println(a+ " / " + b + " = " + q);
        System.out.println(a+ " % " + b + " = " + r);
        System.out.println(a+ " = " + q + " * " + b + " " + r);

    }
}
