// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.28. Экспериментальным путем определите, как влияет использование в программе
//Factors (листинг 1.3.9) условия завершения (fa c to r <= n /fa c to r) вместо
//(fa c to r < п). Для каждого метода найдите наибольшее значение п, с которым при
//вводе числа из п цифр программа гарантированно завершается за 10 секунд.

public class a33_FactorsNFactor {
    public static void main(String[] args) {
        long number = 37872082248L;

        for (int factor = 2; factor < number; factor++) {
            while (number % factor == 0) {
                number /= factor;
                System.out.print(factor + " ");
            }
        }
        if (number > 0) {
            System.out.print(number);
        }
    }
}
