// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

public class a09_MultiFor {
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                if (x == 1) {
                    x++;
                }
                System.out.println(x + " " + y);

            }
        }

        int x = 0;
        int y = 30;
        for (int i = 0; i < 3; i++) {
            for (int j = 4; j > 1; j--) {
                x = x + 0;
                y = y - 2;
                if (x == 6) {
                    System.out.println("in if");
                    break;
                }
                x = x + 3;
                System.out.println("inner " + y);
            }
            y = y - 2;
            System.out.println("out " + y);
        }
    }
}
