package src;
// Enter cost of 3 items from the user (using float data types) a pencil, a pen, and a earaser. You have to output the total cost of the items back to the user as their bill.
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of a Pencil: ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of a Pen: ");    
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of a Eraser: ");
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        System.out.println("The Total Cost of the items is: " + totalCost);

        // Add on-with  18% tax

        float newTool = totalCost + (0.18f * totalCost);
        System.out.println("Bill with 18% tax: " +newTool);
    }
}
