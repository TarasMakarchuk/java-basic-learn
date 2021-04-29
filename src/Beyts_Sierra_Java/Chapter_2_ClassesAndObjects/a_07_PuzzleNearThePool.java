// created 05.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_07_PuzzleNearThePool {
    public static void main(String[] args) {
        int x =0;
        while(x < 4){

            System.out.print("a");
            if(x < 1){
                System.out.print(" ");
            }
            System.out.print("n");

            if(x > 1){
                System.out.print(" oyster" );
                x= x+2;
            }
            if(x == 1){
                System.out.print("noys");
            }
            if(x < 1){
                System.out.print("oise");
            }
            System.out.println("");
            x++;

            //RESULT
            //a noise
            //annoys
            //an oyster

//            System.out.print("an");
//            System.out.print("noys");
//            System.out.print("oise");
//            System.out.print(" oyster");
//            System.out.print("annoys");
//            System.out.print("noise");




        }
    }
}

