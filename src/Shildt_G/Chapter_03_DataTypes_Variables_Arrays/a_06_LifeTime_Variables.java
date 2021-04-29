// created 13.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_06_LifeTime_Variables {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1;
            System.out.println("y equals " + y);
            y = 100;
            System.out.println("now y equals " + y);
        }
    }
}
