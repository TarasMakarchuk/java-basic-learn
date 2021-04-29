// created 05.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_06_PuzzleMixedMessages {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while(x < 5){
            if(y < 5){
                x = x +1;
                if(y < 3){
                    x = x -1;
                }
            }
            y = y +2;
            System.out.print(x +" " + y + " ");
            x = x + 1;
        }
    }
}
