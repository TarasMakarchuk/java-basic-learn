// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_03_Books {
    String title;
    String author;
}

class BooksTestDrive{
    public static void main(String[] args) {
        a_03_Books [] myBooks = new a_03_Books[3];
        int count = 0;
        while(count < myBooks.length){
            myBooks[count] = new a_03_Books();
            count++;
        }

        int x = 0;
        myBooks[0].title = "Плоды java";
        myBooks[1].title = "java Гетсби";
        myBooks[2].title = "Рецепты java";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x++;
        }

    }
}
