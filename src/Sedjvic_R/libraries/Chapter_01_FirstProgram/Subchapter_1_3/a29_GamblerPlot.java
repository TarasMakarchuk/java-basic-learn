// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.24. Напишите программу GamblerPlot, которая трассирует модель задачи
//о разорении игрока и выводит после каждой ставки строку, в которой для каждого
//доллара на руках у игрока выводится звездочка.

public class a29_GamblerPlot {
    public static void main(String[] args) {
        int stake = 10;
        int goal = 25;
        int trials = 50;

        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                String cashBalance = "";

                bets++;

                if (Math.random() < 0.5) {
                    for (int j = 0; j < cash; j++) {
                        cashBalance += "*";
                    }
                    System.out.println(cashBalance + " " +cash);
                    cash++;
                } else {
                    for (int j = 0; j < cash; j++) {
                        cashBalance += "*";
                    }
                    System.out.println(cashBalance + " " +cash);
                    cash--;
                }
            }
            if (cash == goal) {
                wins++;
            }
        }
        System.out.println("bets " + bets);
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}
