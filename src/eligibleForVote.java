package src;

import java.util.Scanner;

//Eligible for voting or not

public class eligibleForVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for Voting");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager Not yet Eligible for Voting ");
        } else {
            System.out.println("Not Eligible for voting");
        }

    }
}
