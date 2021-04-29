// created 13.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

public class a05_RandomCards {
    public static void main(String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int i1 = (int) (Math.random() * SUITS.length);
        int j1 = (int) (Math.random() * RANKS.length);
        System.out.println(RANKS[j1] + " " + SUITS[i1]);
        System.out.println();

        String deck[] = new String[RANKS.length * SUITS.length];
        for (int k = 0; k < RANKS.length; k++) {
            for (int l = 0; l < SUITS.length; l++) {
                deck[SUITS.length * k + l] = RANKS[k] + " of " + SUITS[l];
            }
        }

        int n1 = deck.length;
        for (int k = 0; k < n1; k++) {
            int random = k + (int) (Math.random() * (n1 - k));
            String temp = deck[k];
            deck[k] = deck[random];
            deck[random] = temp;
        }

        int m = 5;
        int n = 53;

        for (int i = 0; i < m; i++) {
            int random = i + (int) (Math.random() * (n-i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < m; i++) {
            System.out.println(deck[i] + " ");
        }
    }
}
