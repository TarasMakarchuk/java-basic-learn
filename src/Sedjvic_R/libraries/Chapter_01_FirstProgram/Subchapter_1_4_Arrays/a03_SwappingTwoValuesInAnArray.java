// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a03_SwappingTwoValuesInAnArray {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int i = (int) (Math.random() * SUITS.length);
        int j = (int) (Math.random() * RANKS.length);
        System.out.println(RANKS[j] + " " + SUITS[i]);
        System.out.println();

        String deck[] = new String[RANKS.length * SUITS.length];
        for (int k = 0; k < RANKS.length; k++) {
            for (int l = 0; l < SUITS.length; l++) {
                deck[SUITS.length * k + l] = RANKS[k] + " of " + SUITS[l];
            }
        }

        int n = deck.length;
        for (int k = 0; k < n; k++) {
                int random = k + (int) (Math.random() * (n - k));
                String temp = deck[k];
                deck[k] = deck[random];
                deck[random] = temp;
        }

        for (int k = 0; k < deck.length; k++) {
            System.out.println(deck[k]);
        }


    }
}
