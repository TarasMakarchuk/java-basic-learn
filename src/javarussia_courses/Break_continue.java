package javarussia_courses;

public class Break_continue {
    public static void main(String[] args) {
        for (int j = 0; j <= 15 ; j++) {
            if(j % 2 == 0){
                continue;
            }
            System.out.println("this not even number " + j);
        }

        int i = 0;
        while(true){
            if(i == 10){
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("We out with cyсle");


        
    }
}
