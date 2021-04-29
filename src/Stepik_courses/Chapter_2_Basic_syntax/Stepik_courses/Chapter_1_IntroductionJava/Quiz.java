package Stepik_courses.Chapter_2_Basic_syntax.Stepik_courses.Chapter_1_IntroductionJava;

import java.security.MessageDigest;

public class Quiz {

    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        System.out.println(true ^ false);
        System.out.println(true != false);

        for(byte b: digest){
            System.out.printf("%02x", b);

        }
    }
}
