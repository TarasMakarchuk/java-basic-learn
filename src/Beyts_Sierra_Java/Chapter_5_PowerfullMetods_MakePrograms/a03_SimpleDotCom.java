// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

public class a03_SimpleDotCom {
    public static void main(String[] args) {
        SimpleDotCom2 dot = new SimpleDotCom2();
        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}

class SimpleDotCom2 {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locations) {
        locationCells = locations;
    }

    public String checkYourself(String userGuess) {
        int guess = Integer.parseInt(userGuess);
        String result = "мимо";
        for(int cell: locationCells){
            if(guess == cell){
                result = "попал";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length){
            result = "потопил";
        }
        System.out.println(result);
        return result;
    }

}
