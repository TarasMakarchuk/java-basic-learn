// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_06_ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("i " + i);
        System.out.println("b " + b);
    }
}
