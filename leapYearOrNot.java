package DSA_JAVA;

//Write a Java Program that takes a year from the user and print whether that year is a leap year or not 

import java.util.Scanner;

public class leapYearOrNot {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Year:");
    int year = sc.nextInt();

    if(year % 400 == 0){
        System.out.println("It is a Leap Year");
    }else if (year % 400 ==0 ){
        System.out.println("Not a Leap Year");
    }else if( year % 4 ==0 ){
        System.out.println("It is a Leap Year");
    }else{
        System.out.println("Not a Leap Year");
    }
    sc.close();
    }
    
}
