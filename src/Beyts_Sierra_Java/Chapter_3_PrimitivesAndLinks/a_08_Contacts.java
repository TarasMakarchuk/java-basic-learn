// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_08_Contacts {
    String name;
    public static void main(String[] args) {
        a_08_Contacts[] contacts = new a_08_Contacts[10];
        int x =0;
        while(x < 10){
            contacts[x] = new a_08_Contacts();
            x++;
        }

        contacts[0].name = "Bob";
        System.out.println(contacts[0].name);

        a_08_Contacts refc;
        int y = 0;
        while(y < 10){
            refc = new a_08_Contacts();
            y++;
        }

        // refc[0].name = "Paul"; не сработает

    }
}
