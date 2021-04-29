// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_10_BoolLogic {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = a | b; // true
        boolean d = a & b; //false
        boolean e = a ^ b; // true
        boolean f = (!a & b) | (a & !b); // true | true -> true
        boolean g = !a; //false

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("e " + e);
        System.out.println("f " + f);
        System.out.println("g " + g);
    }
}
