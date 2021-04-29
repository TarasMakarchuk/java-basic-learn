package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_2_Basic_syntax;// created 15.01.2021
//
//        Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
//        Палиндромом называется строка, которая читается одинаково слева направо и справа налево
//        (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры.
//        А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что
//        в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания).
//        Т.е. русских, китайских и прочих экзотических символов в строке не будет.
//        Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода
//        добавит проверяющая система.
//
//        Подсказки (не читайте, если хотите решить сами):
//        для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться
//        регулярным выражением "[^a-zA-Z0-9]"; найдите в классе String метод, выполняющий замену по
//        регулярному выражению;
//        для перестановки символов строки в обратном порядке можно воспользоваться методом reverse(),
//        который находится в классе StringBuilder;
//        в классе String есть методы для преобразования всей строки в верхний и нижний регистр.
//        Sample Input:
//
//        Madam, I'm Adam!
//        Sample Output:
//        true


import java.sql.SQLOutput;

public class T_07_isPalindrome {
    public static void main(String[] args) {

        String text = "A";

        isPalindrome(text);
        isPalindrome1(text);
        isPalindrome2(text);
    }

    public static boolean isPalindrome(String text) {
        if (text.length() <= 1) {
            return true;
        }
        String onlyLatinText = text.replaceAll("[^A-Za-z0-9]", "").trim().toLowerCase();
        int halfStringLength = onlyLatinText.length() / 2;
        String halfStringPart1 = onlyLatinText.substring(0, halfStringLength);

        if (onlyLatinText.length() % 2 == 0) {
            String halfStringPart2 = onlyLatinText.substring(halfStringLength);
            StringBuilder halfStringPart2Reverse = new StringBuilder(halfStringPart2).reverse();
            return halfStringPart1.contentEquals(halfStringPart2Reverse);
        } else {
            String halfStringPart2 = onlyLatinText.substring(halfStringLength + 1);
            StringBuilder halfStringPart2Reverse = new StringBuilder(halfStringPart2).reverse();
            return halfStringPart1.contentEquals(halfStringPart2Reverse);
        }
    }


    public static boolean isPalindrome1(String text){
        String onlyLatinTextTransform = text.replaceAll("[^A-Za-z0-9]", "").trim().toLowerCase();
        StringBuilder reverseOnlyLatinTextTransform = new StringBuilder(onlyLatinTextTransform).reverse();
        return onlyLatinTextTransform.contentEquals(reverseOnlyLatinTextTransform);
    }


    public static boolean isPalindrome2(String text){
        String t = text.replaceAll("[^a-zA-Z0-9]*","");
        return new StringBuilder(t).reverse().toString().equalsIgnoreCase(t);
    }
}
