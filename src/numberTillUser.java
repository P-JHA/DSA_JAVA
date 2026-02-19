package src;

//Keep Entering number till user enters a multiple of 10.

import java.util.Scanner;

public class numberTillUser {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your number: ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                System.out.println("Multiple of 10 Found: " + n);
                break;
            }
        }
        sc.close();
    }
}
