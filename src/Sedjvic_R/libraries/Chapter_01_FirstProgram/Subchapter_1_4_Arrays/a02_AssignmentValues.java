// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a02_AssignmentValues {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int i = (int) (Math.random() * SUITS.length);
        int j = (int) (Math.random() * RANKS.length);
        System.out.println(RANKS[j] + " " + SUITS[i]);

        String deck [] = new String[RANKS.length * SUITS.length];
        for (int k = 0; k < RANKS.length ; k++) {
            for (int l = 0; l < SUITS.length; l++) {
                deck[SUITS.length*k +l] = RANKS[k] + " of " + SUITS[l];
            }
        }

        for (int k = 0; k < deck.length; k++) {
            System.out.println(deck[k]);
        }
    }
}
