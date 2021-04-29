// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_10_RecursionArrayValues {
    int values[];
    a_10_RecursionArrayValues (int i){
        values = new int[i];
    }

    void printArray(int i){
        if(i == 0){
            return;
        } else{
            printArray(i - 1);
            System.out.println("[" + (i-1) + "] " + values[i-1]);
        }
    }
}

class Recursion2{
    public static void main(String[] args) {
        a_10_RecursionArrayValues obj = new a_10_RecursionArrayValues(10);

        for (int i = 0; i < 10; i++) {
            obj.values[i] = i;
        }
        obj.printArray(10);
    }
}
