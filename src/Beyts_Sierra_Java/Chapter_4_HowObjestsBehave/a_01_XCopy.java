// created 05.03.2021
package Beyts_Sierra_Java.Chapter_4_HowObjestsBehave;

public class a_01_XCopy {
    public static void main(String[] args) {
        int orig = 42;
        a_01_XCopy x = new a_01_XCopy();

        int y = x.go(orig);
        System.out.println(orig + " " + y);

    }

    int go(int arg){
        arg = arg * 2;
        return arg;
    }
}
