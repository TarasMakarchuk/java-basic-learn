// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_15_ForEach {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for (int number: numbers){
            System.out.println("number = " + number);
            sum += number;
        }
        System.out.println("sum = " + sum);
    }
}
