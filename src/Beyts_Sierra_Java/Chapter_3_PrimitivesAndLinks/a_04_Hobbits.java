// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_04_Hobbits {
    String name;

    public static void main(String[] args) {
        a_04_Hobbits [] hobbits = new a_04_Hobbits[3];

        int z = 0;

        while(z < 3){
            hobbits[z] = new a_04_Hobbits();
            hobbits[z].name = "Bilbo";
            if(z==1){
                hobbits[z].name = "Frodo";
            }
            if(z==2){
                hobbits[z].name = "Sem";
            }
            System.out.print(hobbits[z].name + " - ");
            System.out.println("имя хорошего хоббита");
            z++;
        }

    }
}


