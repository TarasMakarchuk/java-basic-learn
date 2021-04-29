// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.2.24. Капитализация процентов. Напишите программу, которая вычисляет и выводит
//сумму, которую вы получите через t лет при размещении Р долларов под
//ежегодный процент г (непрерывно начисляемый). Искомое значение вычисляется
//по формуле Реп.


//1.3.17. Доработайте свое решение упражнения 1.2.24, чтобы программа выводила
//общую накопленную сумму и текущие проценты после каждого ежемесячного
//перерасчета суммы вклада.

public class a23_DepositInterests {
    public static void main(String[] args) {
        //consolidation % at the end of mouth
        int termMonths = 18;
        int depositSumP = 1000;
        double percentR = 9.99;
        //1107.5416701838262
        double termYearN = 1.0/12.0;

        double percentSum = 0;

        for (int i = 0; i < termMonths; i++) {
            percentSum = percentSum + depositSumP*Math.pow(2.78, percentR/100*termYearN) - depositSumP;
        }

        System.out.println("term " + termMonths + " months");
        System.out.println("deposit sum $ " + depositSumP);
        //consolidation % at the end of mouth
        System.out.println("consolidation % at the end of mouth: $ " + percentSum);
        //consolidation % every day
        System.out.println("consolidation % every day: $ " + (double) (depositSumP*Math.pow(2.78, percentR/100*1.5) - depositSumP));

        double sum = 0.0;
        for (int i = 1; i <= 1000000; i++) {
            sum += 1.0 /(1.0 *i*i);
        }
        System.out.println(sum);

    }
}
