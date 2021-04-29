// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_17_ForEachNoChange {
    public static void main(String[] args) {
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        for(int item: numbers){
            System.out.println(item +" ");
            item*=10; //does not changed

        }
        System.out.println();

        for(int item: numbers)
            System.out.println(item + " ");
    }
}
