package src;

import java.util.Scanner;

public class calculateSum {
    public static int calculateSum(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of A:");
        int a = sc.nextInt();
        System.out.println("Enter the Value of B:");
        int b = sc.nextInt();
        int sum = calculateSum(a,b);
        System.out.println("Sum is :" + sum);
        sc.close();
    }
}
