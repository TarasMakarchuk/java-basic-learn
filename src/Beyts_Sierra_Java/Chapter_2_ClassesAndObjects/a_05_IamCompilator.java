// created 04.02.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_05_IamCompilator {
    public static void main(String[] args) {
        Exercise1b();
        Exercise2b();
        Exercise3b();
    }

    public static void Exercise1b(){
        int x = 1;
        while (x < 10){
            if (x > 3 ){
                System.out.println("большой икс");
            }
            x++;
        }
    }

    public static void Exercise2b(){
        int x = 5;
        while (x > 1){
            x--;
            if (x < 3 ){
                System.out.println("маленький икс");
            }
        }
    }

    public static void Exercise3b(){
        int x = 5;
        while (x > 1){
            x--;
            if (x < 3 ){
                System.out.println("маленький икс");
            }
        }
    }
}
