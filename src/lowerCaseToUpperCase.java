package src;

public class lowerCaseToUpperCase {
    public static void main(String[] args) {
        //convert uppercase characters to lowercase
        for(char ch = 'A'; ch<='Z'; ch++){
            System.out.print((char)(ch | ' '));
            //prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
