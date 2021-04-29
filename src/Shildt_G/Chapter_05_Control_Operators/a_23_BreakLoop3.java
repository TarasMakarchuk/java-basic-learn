// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_23_BreakLoop3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("iteration i = " + i);
            for (int j = 0; j < 100; j++) {
                if(j == 10) break;
                System.out.print(" " +j);
            }
            System.out.println("");
        }
        System.out.println("cycles completed");
    }
}
