package src;

import java.util.Scanner;

public class lowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = sc.nextLine();   // allows full sentence input

        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = Character.toLowerCase(str.charAt(i)); // handle uppercase too

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }

        System.out.println("Count of Vowels is: " + count);

        sc.close(); 
    }
}