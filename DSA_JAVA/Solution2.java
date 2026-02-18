package DSA_JAVA;

// In a Program, input the size of a Square. You have to output the area of the square.

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of a Square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("The Area of the Square is: " + area);
    }
}
