package src;

public class oddOrEvenBitManu {
    public static void oddorevven(int n){
        int bitMask =1;
        if((n&bitMask) == 0){
            //even
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main(String[] args) {
        oddorevven(3);
         oddorevven(11);
          oddorevven(14);
    }
}
