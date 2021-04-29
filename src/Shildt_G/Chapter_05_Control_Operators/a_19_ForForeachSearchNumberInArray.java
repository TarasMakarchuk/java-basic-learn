// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_19_ForForeachSearchNumberInArray {
    public static void main(String[] args) {
        int numbers [] = {6,7,8,9,10,5,1,4};
        int searchValue = 15;
        boolean found = false;

        for(int item: numbers){
            if(item == searchValue){
                found = true;
            }
        }

        if(found)
            System.out .println("value " + searchValue + " is found");
    }
}
