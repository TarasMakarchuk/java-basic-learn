// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_02_Dog {
    String name;

    public static void main(String[] args) {
        a_02_Dog dog1 = new a_02_Dog();

        dog1.bark();
        dog1.name = "Bart";

        a_02_Dog [] myDogs = new a_02_Dog [3];
        myDogs[0] = new a_02_Dog();
        myDogs[1] = new a_02_Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Jorge";

        System.out.print("имя 3й собаки: ");
        System.out.println(myDogs[2].name);

        int x = 0;
        while(x < myDogs.length){
            myDogs[x].bark();
            x++;
        }

    }

    public void bark(){
        System.out.println(name + " say bark!");
    }

    public void eat(){}
    public void chaseCat(){}
}

