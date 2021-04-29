// created 13.02.2021
package Shildt_G.Chapter_02;

public class a_04_If {
    public static void main(String[] args) {
        int x, y;
        x= 10;
        y =20;
        if(x < y) System.out.println("x less than y");

        x *=2;
        if(x == y) System.out.println("now x equals y");

        x *=2;
        if(x > y) System.out.println("x more than y");

        if(x == y) System.out.println("should be not displayed");
    }
}
