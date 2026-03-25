package src;

public class stringFunction {
    public static String substring (String str, int si, int ei){
        String substr =  "";
        for(int i=si; i<ei; i++){
            substr +=str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        //substring 
        System.out.println(substring("Prabhakar", 0, 5));
    }
}
