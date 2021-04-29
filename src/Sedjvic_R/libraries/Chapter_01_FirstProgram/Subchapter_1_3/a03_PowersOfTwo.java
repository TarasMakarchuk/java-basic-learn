// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a03_PowersOfTwo {
    public static void main(String[] args) {
        int n = 20;
        int i = 0;
        int powerTwo = 1;
        while (i < n){
            powerTwo = 2 * powerTwo;
            i++;
            System.out.println(i +"th " + powerTwo);
        }
    }
}
