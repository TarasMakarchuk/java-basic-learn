// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.25. Внесите изменения в программу Gambler, чтобы она получала дополнительный
//аргумент командной строки с фиксированным значением вероятности
//выигрыша каждой ставки. При помощи своей программы попробуйте выяснить, как
//эта вероятность влияет на вероятность выигрыша и ожидаемое количество ставок.
//Опробуйте значения р, близкие к 0,5 (например, 0.48).

public class a30_GamblerChangeProbabilityOfWinning {
    public static void main(String[] args) {
        int stake = 10;
        int goal = 15;
        int trials = 1110;
        double probabilityOfWinning = 0.1;


        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal) {
                String cashBalance = "";

                bets++;
                double randomNumber = Math.random();
                if (randomNumber  < 0.5 + probabilityOfWinning) {
                    System.out.println("0.5 + probabilityOfWinning cash++" + (0.5 + probabilityOfWinning));
                    System.out.println("randomNumber " +randomNumber);
                    cash++;
                    for (int j = 0; j < cash; j++) {
                        cashBalance += "*";
                    }
                    System.out.println(cashBalance + " " +cash);
                } else {
                    System.out.println("0.5 + probabilityOfWinning cash--" + (0.5 + probabilityOfWinning));
                    System.out.println("randomNumber " +randomNumber);
                    cash--;
                    for (int j = 0; j < cash; j++) {
                        cashBalance += "*";
                    }
                    System.out.println(cashBalance + " " +cash);
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
