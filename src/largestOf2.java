package src;
// Print the largest of 2

import java.util.Scanner;

public class largestOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First no. (a)");
        int a = sc.nextInt();
        System.out.println("Enter the Second no. (b)");
        int b = sc.nextInt();
        if (a>=b){
            System.out.println("a is greater");
        }else if (b>=a){
            System.out.println("b is greater");
        }else{
            System.out.println("a and b is equal");
        }
    }
}
