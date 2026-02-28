package src;

import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {
        System.out.println("Calc App Started...");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numerator to divide");
        int num = sc.nextInt();
        System.out.println("Enter the denominator");
        int den = sc.nextInt();
        try{
            int res = num/den;
            System.out.println("Result is : "+ res);
        }catch(Exception e){
            System.out.println("Note: Enter non zero denominator");
        }
        System.out.println("Calc app Terminated...");
        sc.close();
    }
}
