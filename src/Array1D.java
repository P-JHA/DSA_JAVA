package src;

import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Marks Collection App:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Kindly enter marks of student " + i + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("Marks are stored as follows:");

        for (int i = 0; i < 5; i++) {
            System.out.println(marks[i]);
        }

        sc.close();
    }
}