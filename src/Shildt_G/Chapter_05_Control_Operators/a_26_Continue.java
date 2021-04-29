// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_26_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if(i%2==0) continue;
            System.out.println("");
        }
    }
}
