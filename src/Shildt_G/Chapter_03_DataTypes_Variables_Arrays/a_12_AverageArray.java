// created 18.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_12_AverageArray {
    public static void main(String[] args) {
        double[] numbers = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < numbers.length; i++)
            result = result + numbers[i];
        System.out.println("result = " + result / numbers.length);


    }
}
