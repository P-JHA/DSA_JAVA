package src;

class CallByValue {

    public void example(int x, int y) {
        x++;
        y++;
        System.out.println("Inside method - x: " + x + " & y: " + y);
    }
}

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        CallByValue obj = new CallByValue();

        System.out.println("Before method call - a: " + a + " & b: " + b);

        obj.example(a, b);

        System.out.println("After method call - a: " + a + " & b: " + b);
    }
}