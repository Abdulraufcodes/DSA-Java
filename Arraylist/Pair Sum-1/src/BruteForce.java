//Note: arraylist used in this question is sorted

import java.util.ArrayList;

public class BruteForce {

    public static boolean pairSum(ArrayList<Integer> list){
        int target = 5;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
                if((list.get(i)+list.get(j)) == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        if(pairSum(list)){
            System.out.println("Solution exits");
        }else{
            System.out.println("No Solution");
        }
    }
}