// created 05.03.2021
package Beyts_Sierra_Java.Chapter_4_HowObjestsBehave;

public class a_02_Clock {
    String time;

    void setTime (String t){
        time = t;
    }

    String getTime(){
        return time;
    }
}
 class ClockTestDrive{
     public static void main(String[] args) {
         a_02_Clock clock = new a_02_Clock();
         clock.setTime("15 hours");
         String tod = clock.getTime();
         System.out.println("time is: " + tod);
     }
 }
