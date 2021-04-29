// created 18.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_08_TypeConversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("conversion type int in byte");
        b = (byte) i;
        System.out.println("i and b " + i + " " + b);

        System.out.println("conversion double in int");
        i = (int) d;
        System.out.println("d and i " + d + " " + i);

        System.out.println("conversion double to byte");
        b = (byte) d;
        System.out.println("d and b " + d + " " + b);
    }
}
