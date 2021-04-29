// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_22_WhileBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100){
            if(i == 10) break;
            System.out.println("i = " + i);
            i++;
        }
    }
}
