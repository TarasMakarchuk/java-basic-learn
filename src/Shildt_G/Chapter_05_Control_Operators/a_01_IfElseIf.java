// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_01_IfElseIf {
    public static void main(String[] args) {
        int month = 11;
        String season = "";
        if(month == 12 || month == 1 || month == 2){
            season = "winter";
        } else if(month ==3 || month == 4 || month ==5){
            season = "spring";
        } else if(month ==6 || month ==7 || month ==8){
            season = "summer";
        } else if(month == 9 || month ==10 || month ==11){
            season = "autumn";
        } else {
            System.out.println("month does not exist");
        }
        System.out.println(season);
    }
}
