// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

public class a01_TestsSimpleDotCom {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2, 3, 4};
        dot.setLocations(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult = "неудача";
        if(result.equals("попал")){
            testResult = "тест пройден";
        }
        System.out.println(testResult);
    }
}


class SimpleDotCom {
    public void setLocations(int[] locations) {
    }

    public String checkYourself(String userGuess) {
        return "in checkYourself methods";
    }



}