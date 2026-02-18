// Print the largest of 3

import java.util.Scanner;

public class largestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'A': " );
        int a = sc.nextInt();
        System.out.println("Enter the value of 'B': ");
        int b = sc.nextInt();
        System.out.println("Enter the value of 'C': ");
        int c = sc.nextInt();

        if (a > b && a >= 0) {
            System.out.println("A is greatest" + a);
        } else if (b > -a && b >= c) {
            System.out.println("B is greatest" + b);
        } else {
            System.out.println("C is greatest" + c);
        }

    }
}
