// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a04_PowerOfTwo {
    public static void main(String[] args) {
        int n = 64;
        int powerTwo = 1;
        while (powerTwo <= n/2){
            powerTwo = 2 * powerTwo;
        }
        System.out.println(powerTwo);
    }
}
