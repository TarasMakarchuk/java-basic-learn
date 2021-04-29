// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_08_Stack {
    int stack[] = new int[10];
    int tos;

    a_08_Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stack overflow");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack does not loaded");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}

class TestStack{
    public static void main(String[] args) {
        a_08_Stack myStack1 = new a_08_Stack();
        a_08_Stack myStack2 = new a_08_Stack();

        for (int i = 0; i < 10; i++) myStack1.push(i);
        for (int i = 10; i < 20; i++) myStack2.push(i);

        System.out.println("stack 1 values: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack1.pop());
        }

        System.out.println("stack 2 values: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(myStack2.pop());
        }

    }
}