package src;

import java.util.Scanner;

public class argumentIsEvenOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("enter an Integer: ");
        num = sc.nextInt();

        if(isEven(num)){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }
    public static boolean isEven(int number){
        if(number % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }
}

