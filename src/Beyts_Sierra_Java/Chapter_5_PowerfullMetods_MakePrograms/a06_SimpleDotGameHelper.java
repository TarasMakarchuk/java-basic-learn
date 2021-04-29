// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class a06_SimpleDotGameHelper {
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


