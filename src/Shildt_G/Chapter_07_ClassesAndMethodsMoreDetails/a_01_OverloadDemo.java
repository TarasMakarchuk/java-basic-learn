// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_01_OverloadDemo {
    void test(){
        System.out.println("parameters are missing");
    }
    void test(int a){
        System.out.println("int a " + a);
    }
    void test(int a, int b){
        System.out.println("int a = " + a + ", int b = " + b);
    }
    double test(double a){
        System.out.println("double a = " + a);
        return a*a;
    }
}

class Overload{
    public static void main(String[] args) {
        a_01_OverloadDemo overloadDemo = new a_01_OverloadDemo();
        double result;

        overloadDemo.test();
        overloadDemo.test(10);
        overloadDemo.test(10, 20);
        result = overloadDemo.test(123.25);
        System.out.println("overloadDemo.test(123.25): " + result);
    }
}
