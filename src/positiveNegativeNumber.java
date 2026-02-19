package src;

import java.util.Scanner;

// Write a Java Program to get a number from the user and print whether it is a postive or negative 

public class positiveNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of X: ");
        int x = sc.nextInt();

        if(x>0){
            System.out.println("X is greater than 0");
        }else{
            System.out.println("X is less than or equal to 0");
        }
    }
}
