package src;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        System.out.println("Marks Collection App");

        int [][]arr = new int [3][4];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.println("Kindly Enter Marks of Class: "+i + "Student"+j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Marks are Stored as Below");

        for (int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
