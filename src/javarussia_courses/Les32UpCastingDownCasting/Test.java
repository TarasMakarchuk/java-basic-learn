// created 10.10.2020
package javarussia_courses.Les32UpCastingDownCasting;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //Upcasting - восходящее преобразование - дог наследуется от энимал, в иеррахии наследования дог ниже энимал,
        //но сдесь мы делаем преобразование от наследника к родителю. Оно происходит неявно
        Animal animal = dog;


        //Downcasting - нисходящее приеобразование, вручную, оно не всегда безопасно
        Dog dog2 = (Dog) animal;
        dog2.voice();


        Animal a = new Animal();
        Dog dog1 = (Dog) a;
        dog1.voice();
    }

}
