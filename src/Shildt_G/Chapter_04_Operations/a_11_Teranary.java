// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_11_Teranary {
    public static void main(String[] args) {
        int i,k;
        i=10;

        k = i < 0? -i:i;
        System.out.print("absolute value " );
        System.out.println(i + " equals " + k );

        i = -10;
        k = i < 0? -i:i;
        System.out.print("absolute value " );
        System.out.println(i + " equals " + k );
    }
}
