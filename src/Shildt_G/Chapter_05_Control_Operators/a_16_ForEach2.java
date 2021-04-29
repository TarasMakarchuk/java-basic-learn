// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_16_ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int nums: numbers){
            System.out.println("nums = " + nums);
            sum += nums;
            if(nums == 5) break;
        }
        System.out.println("the sum first 5th elements = " + sum);
    }
}
