package src;

import java.util.ArrayList;

public class multiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> List = new ArrayList<Integer>();
        List.add(1);
        List.add(2);
        mainList.add(List);

        ArrayList<Integer> List2 = new ArrayList<Integer>();
        List2.add(3);
        List2.add(4);
        mainList.add(List2);

        for(int i= 0; i<mainList.size(); i++){
            ArrayList<Integer> cuArrayList = mainList.get(i);
            for(int j = 0; j<cuArrayList.size(); j++){
                System.out.print(cuArrayList.get(j)+ " ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
}
