// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_25_BreakLoop4 {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("iteration " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if(j ==10) break outer;
                System.out.print(j + " ");
            }
            System.out.println("this line will not be displayed");
        }
        System.out.println("cycles completed");
    }
}
