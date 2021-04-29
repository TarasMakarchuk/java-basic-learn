// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a08_ToBinary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= n / 2) {
            power *= 2;
        }
        while (power > 0){
            if(n < power){
                System.out.print(0);
            } else{
                System.out.print(1);
                n-= power;
            }
            power /=2;
        }
        System.out.println();
    }
}
