// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_05_BitLogic {
    public static void main(String[] args) {
        String[] binary = {
                "0000", "0001", "0010", "0011", "0100", "0101",
                "0110", "0111", "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111"
        };
        int a = 3;
        int b = 6;

        int c = a | b; //0111 или 7 0011 | 0110 -> 0111
        int d = a & b; //0010 или 2 0011 & 0110 -> 0010
        int e = a ^ b; //1000 или 5 0011 ^ 0110 -> 0101
        int f = (~a & b) | (a & -b); //0110 или 6
        int g = ~a & 0x0f; //1111 или 12 1100 1111
        //0x0f - число 15 в 16ричной 0123456789abcdef

        System.out.println("c " + c);
        System.out.println("d " + d);
        System.out.println("e " + e);
        System.out.println("f " + f);
        System.out.println("g " + g);

    }
}
