package mypack;

import java.util.Scanner;

public class Main {
    public static void demo(){
        test testtest = new test(1,"te",2.0,2.0,2.0);
        test t3 = new test();
        System.out.println(t3.getmyObj());
        System.out.println(testtest.getW());
    }
    public static void main(String[] args) {
        demo();
        //Person abox = new Person();
    }
    
}