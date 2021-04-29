// created 13.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_05_VariablesScope {
    public static void main(String[] args) {
        int x;
        x=10;
        if(x == 10){
            int y = 20;
            System.out.println("in if x equals " + x + " y equals " + y);
            x = y * 2;
        }

        // y = 100 ERROR! variable in another scope

        System.out.println("in main x equals " + x);
    }
}
