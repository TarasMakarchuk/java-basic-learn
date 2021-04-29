// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.27. Внесите изменения в программу Factors, чтобы каждый простой множитель
//выводился только в одном экземпляре.

public class a32_FactorsOneUnit {
    public static void main(String[] args) {
        long number = 3757208;

        for (long i = 2; i <= number / i; i++) {
            int counter = 0;
            while (number % i == 0) {
                number = number / i;
                if(counter < 1){
                    System.out.print(i + " ");
                }
                counter++;
            }
        }
        if(number > 1){
            System.out.println(number);
        }
    }
}
