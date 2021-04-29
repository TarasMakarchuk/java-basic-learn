// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_08_ReturnOfObjects {
    int a;

    a_08_ReturnOfObjects(int i){
        a = i;
    }

    a_08_ReturnOfObjects incrementByTen(){
        a_08_ReturnOfObjects temp = new a_08_ReturnOfObjects(a+10);
        return temp;
    }
}

class ReturnOfObject{
    public static void main(String[] args) {
        a_08_ReturnOfObjects obj1 = new a_08_ReturnOfObjects(2);
        a_08_ReturnOfObjects obj2;

        obj2 = obj1.incrementByTen();
        System.out.println("obj1.a" + obj1.a);
        System.out.println("obj2.a" + obj2.a);

        obj2 = obj2.incrementByTen();
        System.out.println("obj2.a after second increment value: " + obj2.a);
    }
}
