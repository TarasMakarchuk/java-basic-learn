// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_18_ForEachMultidimensionalArrays {
    public static void main(String[] args) {
        int sum =0;
        int numbers[][] = new int[3][5];

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 5; k++) {
                numbers[j][k] = (j+1)*(k+1);
            }
        }

        for(int item0[]: numbers){
            for(int item1: item0){
                System.out.print(" item1 = " + item1);
                sum+= item1;
            }
            System.out.println("");
        }
        System.out.println("sum = " + sum);
    }
}
