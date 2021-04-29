// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

public class a_04_SwitchSeasonsOfYear {
    public static void main(String[] args) {
        int month = 4;
        String season = null;
        switch (month){
            case 12:
            case 1:
            case 2:
                season = "winter";
                break;
            case 3:
            case 4:
            case 5:
                    season = "spring";
                    break;
            case 6:
            case 7:
            case 8:
                season = "summer";
                break;
            case 9:
            case 10:
            case 11:
                season = "winter";
                break;
            default:
                System.out.println("month does not exist");
        }
        System.out.println(season);
    }
}
