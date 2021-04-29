// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_03_AssignmentOperations {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a+=5;
        b*=4;
        c+=a*b;
        c%=6;

        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
    }
}
