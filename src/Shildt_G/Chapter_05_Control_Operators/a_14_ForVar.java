// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_14_ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i =0;
        for (; !done; ) {
            System.out.println("i equals " + i);
            if(i ==10) done = true;
            i++;
        }
    }
}
