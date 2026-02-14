package DSA_JAVA;

// In a Program, input 3 numbers : A,B and C. You have to output the average of these 3 Numbers.

import java.util.*;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers A:");
        int a = sc.nextInt();
        System.out.println("Enter the Numbers B:");
        int b = sc.nextInt();
        System.out.println("Enter the Numbers C:");
        int c= sc.nextInt();
        int avg = ((a+b+c)/3);
        System.out.println("The average is:" + avg);
    }
}
