// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_24_BreakLabel {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
                third: {
                    System.out.println("before operator break");
                    if (t) break second;
                    System.out.println("third: this operator will not be executed");
                }
                System.out.println("second: this operator will not be executed");
            }
            System.out.println("first: this operator follows block second");
        }
    }
}
