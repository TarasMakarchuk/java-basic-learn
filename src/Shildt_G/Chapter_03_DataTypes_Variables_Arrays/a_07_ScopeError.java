// created 13.02.2021
package Shildt_G.Chapter_03_DataTypes_Variables_Arrays;

public class a_07_ScopeError {
    public static void main(String[] args) {
        int bar = 1;
        System.out.println(bar);
        {
//            int bar = 2; //error variable is already declaration
            System.out.println(bar);
        }
    }
}
