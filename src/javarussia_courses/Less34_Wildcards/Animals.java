// created 10.10.2020
package javarussia_courses.Less34_Wildcards;

public class Animals {
    private int id;

    public Animals(){

    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public Animals(int id){
        this.id = id;
    }
    public String toString(){
        return String.valueOf(id);
    }
}
