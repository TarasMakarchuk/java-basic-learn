// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

public class a09_Gambler {
    public static void main(String[] args) {
        int stake = 10;
        int goal = 20;
        int trials = 1000;

        int bets = 0;
        int wins = 0;

        for (int i = 0; i < trials; i++) {
            int cash = stake;
            while (cash > 0 && cash < goal){
                bets++;
                if(Math.random() < 0.5){
                    cash++;
                } else {
                    cash --;
                }
            }
            if(cash == goal){
                wins++;
            }
        }
        System.out.println(100*wins/trials + "% wins");
        System.out.println("Avg # bets: " + bets/trials);
    }
}
