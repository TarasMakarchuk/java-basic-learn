// created 22.02.2021
package Shildt_G.Chapter_05_Control_Operators;

import java.io.IOException;

public class a_08_WhileChoiceMenu {
    public static void main(String[] args) throws IOException {
        char choice;
        do {
            System.out.println("operators help");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" 3. while");
            System.out.println(" 4. do-while");
            System.out.println(" 5. for \n");
            System.out.print("select the item you want: ");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

//        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if\n");
                System.out.println("if(condition) operator;");
                System.out.println("else operator;");
                break;
            case '2':
                System.out.println("switch\n");
                System.out.println("switch expression {");
                System.out.println("case constant: ");
                System.out.println(" sequence operators");
                System.out.println("break");
                System.out.println("//...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while\n");
                System.out.println("while(condition) operator;");
                break;
            case '4':
                System.out.println("do-while\n");
                System.out.println("do {");
                System.out.println(" operator;");
                System.out.println("} while (condition);");
                break;
                case '5':
                System.out.println("for\n");
                System.out.println("for (initialisation; condition; iteration) {");
                System.out.println(" operator;");
                System.out.println(" }");
                break;
        }
    }
}
