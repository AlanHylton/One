package com.mycompany.mavenproject1;

import java.util.Scanner;



public class Main {//START OF PROGRAM
    static Scanner SC = new Scanner(System.in);
    static int answer, num1, num2, num3;

    public static void main(String[] args) {//start of main method (is were you tell it to do something.)
        //helloWorld();
        //printOut();
        //addNumbers();
        //largestNumber ();

    } //end of main method
//(start of making the codes)
    public static void helloWorld() {
        System.out.println("hello world");
    }

    public static void printOut() {
        num1 = 7;
        System.out.println("Number one is" + num1);
    }

    public static void addNumbers() {
        num2 = 4;
        num3 = 10;
        answer = num2 + num3;
    }

    public static void answernumber() {
        if (num1 > num2) {
            answer = num1;
        } else {
            answer = num2;
        }
    }
    
    public static void largestNumber(){
        System.out.println("enter a number: ");
        num1 = SC.nextInt();
        System.out.println("you entered the number " + num1);

        System.out.println("enter first number");
        num1 = SC.nextInt();
        System.out.println("enter second number");
        num2 = SC.nextInt();
        System.out.println("enter third number");
        num3 = SC.nextInt();

        if (num1 > num2) {
            answer = num1;
        } else {
            answer = num2;
        }
        if (num3 > answer) {
            answer = num3;
        }
        System.out.println("the answer number is " + answer);

    }
//end of making the code
}//END OF FILE,DONT WRITE DEYOND POINT
