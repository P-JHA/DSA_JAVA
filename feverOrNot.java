//You have a fever if your temperaure is above 100 and otherwise prints you don't have a fever

import java.util.Scanner;
public class feverOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Temperature");
        double temp = sc.nextDouble();
        if (temp >100){
            System.out.println("You have a Fever");
        }else{
            System.out.println("You don't have a Fever");
        }
    }
}
