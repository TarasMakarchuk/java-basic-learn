// created 12.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.23. Напишите версию программы Gambler, использующую два вложенных цикла
//while или два вложенных цикла fo r (вместо цикла while в цикле for).

public class a28_Gambler2While2For {
    public static void main(String[] args) {
        int stake = 10;
        int goal = 20;
        int trials = 1000;

        int bets = 0;
        int wins = 0;

        //todo 2 while
//        int i = 0;
//        while(i < trials){
//            int cash = stake;
//            while (cash > 0 && cash < goal) {
//                bets++;
//                if (Math.random() < 0.5) {
//                    cash++;
//                } else {
//                    cash--;
//                }
//            }
//            if (cash == goal) {
//                wins++;
//            }
//
//            i++;
//        }

        //todo 2 for
        for (int i = 0; i < trials; i++) {
            int cash = stake;
            for (;cash > 0 && cash < goal;) {
                bets++;
                if (Math.random() < 0.5) {
                    cash++;
                } else {
                    cash--;
                }
            }
            if (cash == goal) {
                wins++;
            }
        }

        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets: " + bets / trials);
    }
}

//todo original code

// int stake = 10;
//        int goal = 20;
//        int trials = 1000;
//
//        int bets = 0;
//        int wins = 0;
//
//        for (int i = 0; i < trials; i++) {
//            int cash = stake;
//            while (cash > 0 && cash < goal) {
//                bets++;
//                if (Math.random() < 0.5) {
//                    cash++;
//                } else {
//                    cash--;
//                }
//            }
//            if (cash == goal) {
//                wins++;
//            }
//        }
//        System.out.println(100 * wins / trials + "% wins");
//        System.out.println("Avg # bets: " + bets / trials);
