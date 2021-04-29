// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a10_Factors {
    public static void main(String[] args) {
        long number = 4444;

        for (long i = 2; i <= number / i; i++) {
            while (number % i == 0) {
                number = number / i;
                System.out.print(i + " ");
            }
        }
      if(number > 1){
          System.out.println(number);
      }
    }
}
