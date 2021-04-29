// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_02_OverloadDemo1 {
    void test(){
        System.out.println("parameters are missing");
    }
    void test(int a, int b){
        System.out.println("a and b: " + a + " " + b);
    }
    void test(double a){
        System.out.println("internal conversion on call test(double a): " + a);
    }
}

class Overload1{
    public static void main(String[] args) {
        a_02_OverloadDemo1 overloadDemo2 = new a_02_OverloadDemo1();
        int i = 88;

        overloadDemo2.test();
        overloadDemo2.test(10,20);
        overloadDemo2.test(i);
        overloadDemo2.test(123.2);

    }
}