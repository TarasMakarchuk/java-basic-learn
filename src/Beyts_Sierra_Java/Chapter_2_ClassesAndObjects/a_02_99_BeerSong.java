// created 04.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_02_99_BeerSong {
    public static void main(String [] args){
        int beerNum = 5;
        String word = "бутылок (бутылки)";

        while(beerNum > 0){
            if(beerNum == 1){
                word = "бутылка";
            }

            System.out.println(beerNum + " " + word + " пива");
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println("Возьми одну");

            beerNum = beerNum -1;
            if(beerNum > 0){
                System.out.println(beerNum + " " + word + " пива на стене");
            } else{
                System.out.println("Нет бутылок пива на стене");
            }
        }
    }
}
