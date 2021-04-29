// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_03_SwitchMissingBreak {
    public static void main(String[] args) {
        for (int i = 0; i < 12; i++) {
            switch (i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i less than 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i less than 10");
                    break;
                default:
                    System.out.println("i equals or more than 10");
            }
        }
    }
}
