// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.10. Напишите программу Deal, которая получает целое число п как аргумент
//командной строки и выводит п покерных раздач (по пять карт каждая) из перетасованной
//колоды, разделенных пустыми строками.

public class a23_Deal {
    public static void main(String[] args) {
        int n = 4;

        String[] suit = {"\u2665", "\u2666", "\u2663", "\u2660"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                int randomSuit = (int) (Math.random() * suit.length);
                int randomRank = (int) (Math.random() * rank.length);
                System.out.print(rank[randomRank]);
                System.out.print(suit[randomSuit] + " ");

            }
            System.out.println(" ");
        }
    }
}
