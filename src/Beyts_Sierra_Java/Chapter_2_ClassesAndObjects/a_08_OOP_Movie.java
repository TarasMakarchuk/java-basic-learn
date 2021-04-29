// created 05.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_08_OOP_Movie {
    static class Movie {
        String title;
        String genre;
        int rating;
        void playIt(){
            System.out.println("Now playing movie: " + this.title +", genre: "+ this.genre+" rating: " + this.rating);
        };
    }

    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to loose on shares";
        one.genre = "tragedy";
        one.rating = -2;
        one.playIt();

        Movie two = new Movie();
        two.title = "The lost in the office";
        two.genre = "comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte-club";
        three.genre = "tragedy but funny";
        three.rating = 127;
        three.playIt();
    }
}
