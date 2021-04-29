// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_06_Test1 {
    void meth(int i, int j) {
        i *= i;
        j /= j;
    }
}

class CallByValue {
    public static void main(String[] args) {
        a_06_Test1 object = new a_06_Test1();
        int a = 15, b = 20;
        System.out.println("a and b before on call: " + a + " " + b);
        object.meth(a, b);
        System.out.println("a and b after on call: " + a + " " + b);

    }
}
