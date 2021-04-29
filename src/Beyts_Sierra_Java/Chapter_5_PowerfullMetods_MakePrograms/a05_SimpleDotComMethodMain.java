// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;


import java.util.Arrays;

public class a05_SimpleDotComMethodMain {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper1 helper = new GameHelper1();
        SimpleDotCom5 theDotCom = new SimpleDotCom5();
        int randomNum = (int) (Math.random()*5);

        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theDotCom.setLocationCells(locations);

        boolean isAlive = true;

        while(isAlive){
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

class GameHelper1{
    public String getUserInput(String str){
        return "Потопил";
    }
}
class SimpleDotCom5{
    int[] locations;
    public void setLocationCells(int[] locationCells){
        locations = locationCells;
    }

    public String checkYourself(String str){
        return str;
    }
}