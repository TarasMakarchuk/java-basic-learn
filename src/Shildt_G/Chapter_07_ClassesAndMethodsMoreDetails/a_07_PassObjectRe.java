// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_07_PassObjectRe {
    int a,b;
    a_07_PassObjectRe(int i, int j){
        a = i;
        b = j;
    }

    void meth (a_07_PassObjectRe object){
        object.a *=2;
        object.b /=2;
    }
}

class PassObjectRe{
    public static void main(String[] args) {
        a_07_PassObjectRe object = new a_07_PassObjectRe(15, 20);

        System.out.println("object.a and object.b before on call: " + object.a + " " + object.b);
        object.meth(object);
        System.out.println("object.a and object.b after on call: " + object.a + " " + object.b);
    }
}
