package DSA_JAVA;
import java.util.Scanner;

//Print if a number is odd or even

public class oddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }

    }
}
