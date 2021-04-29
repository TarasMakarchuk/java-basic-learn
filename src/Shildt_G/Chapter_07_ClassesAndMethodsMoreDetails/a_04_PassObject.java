// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_04_PassObject {
    int a,b;

    a_04_PassObject(int i, int j){
        a =i;
        b =j;
    }

    boolean equalTo(a_04_PassObject object){
        if(object.a == a && object.b ==b) return true;
        else return false;
    }
}

class PassObject{
    public static void main(String[] args) {
        a_04_PassObject object1 = new a_04_PassObject(100,22);
        a_04_PassObject object2 = new a_04_PassObject(100,22);
        a_04_PassObject object3 = new a_04_PassObject(-1,-1);

        System.out.println("object1.equals(object2): " +object1.equalTo(object2));
        System.out.println("object2.equals(object3): " +object2.equalTo(object3));
    }
}
