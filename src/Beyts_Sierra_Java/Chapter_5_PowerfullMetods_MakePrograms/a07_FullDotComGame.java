// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class a07_FullDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotComFinal theDotCom = new SimpleDotComFinal();
        int randomNum = (int) (Math.random()*5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
            System.out.println(isAlive);
            String guess = helper.getUserInput("Введите число: ");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("Потопил")){
                isAlive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
            }
        }
    }
}

class SimpleDotComFinal {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
        System.out.println(Arrays.toString(locationCells));
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "мимо";
        for (int cell : locationCells) {
            if (guess == cell && cell != 0) {
                result = "попал";
                numOfHits++;
                break;
            }
        }

// todo код убирает баг с повторным введением числа
//        for (int i = 0; i < locationCells.length; i++) {
//            if(guess == locationCells[i] && locationCells[i] !=-1){
//                result = "попал";
//                locationCells[i] = -1;
//                numOfHits++;
//                break;
//            }
//        }


        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}

class GameHelper {
    public String getUserInput(String prompt){
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length() == 0){
                return null;
            }
        } catch (IOException e){
            System.out.println("IOException" + e);
        }
        return inputLine;
    }
}