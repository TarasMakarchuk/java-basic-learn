// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_21_ForEachBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(i == 10) break;
            System.out.println("i = " + i);
        }
        System.out.println("cycle completed");
    }
}
