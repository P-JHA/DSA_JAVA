package src;

import java.util.Scanner;

public class averageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first Variable: ");
        double x = sc.nextInt();
        System.out.println("Input the Second Variable: ");
        double y = sc.nextInt();
        System.out.println("Input the Third Variable: ");
        double z = sc.nextInt();
        System.out.println("The average of the Variable is : " + average(x,y,z));
    }
    public static double average (double x, double y, double z){
        return (x+y+z)/3;
        
    }
}
