// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.26. Внесите изменения в программу Gambler, чтобы она получала дополнительный
//аргумент командной строки с количеством ставок, которые готов
//сделать игрок, чтобы у игры было три возможных исхода: игрок выигрывает,
//игрок проигрывает или у игрока кончается время. Добавьте в вывод ожидаемую
//сумму денег, которая будет на руках у игрока при завершении игры. Задание для
//самостоятельной работы: используйте программу для планирования поездки
//в Монте-Карло.

public class a31_GamblerBetsQuantity {
    public static void main(String[] args) {
        int stake = 10;
        int goal = 100;
        int trials = 10;
        double probabilityOfWinning = 0.5;
        int betsQuantity = 200;

        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while ((cash > 0 && cash < goal) && betsQuantity > 0) {
                String cashBalance = "";

                bets++;
                double randomNumber = Math.random();
                if (randomNumber  < 0.5 + probabilityOfWinning) {
                    System.out.println("0.5 + probabilityOfWinning cash++" + (0.5 + probabilityOfWinning));
                    System.out.println("randomNumber " +randomNumber);
                    cash++;
                    betsQuantity--;
                    for (int j = 0; j < cash; j++) {
                        cashBalance += "*";
                    }
                    System.out.println(cashBalance + " " +cash);
                } else {
                    System.out.println("0.5 + probabilityOfWinning cash--" + (0.5 + probabilityOfWinning));
                    System.out.println("randomNumber " +randomNumber);
                    cash--;
                    betsQuantity--;
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
