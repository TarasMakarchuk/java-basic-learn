// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_20_ForNested {
    public static void main(String[] args) {
        int i,j;

        for(i = 0; i < 10; i++){
            for (j = i; j < 10; j++) {
                System.out.print(".");
            }
            System.out.println("");
        }
    }
}
