// created 22.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

// Программа ге н е р и р у е т число и р е а ги р у е т на д о га д к и ,
// пока пользователь пытается у га д а т ь число ,

import Sedjvic_R.libraries.StdOut;

public class a02_TwentyQuestions {
    public static void main(String[] args) {
        int secret = 1 + (int)(Math.random()*1_000_000);
        StdOut.print("I thinking of a number ");
        StdOut.println("Between 1 and 1 000 000");
        int guess = 0;

        while (guess != secret){
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if(guess == secret) StdOut.println("You win!");
            if(guess < secret) StdOut.println("Too low");
            if(guess > secret) StdOut.println("Too high");
        }
    }
}
