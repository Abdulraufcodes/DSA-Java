import java.util.ArrayList;

public class Practice {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int ptr1 = 0;
        int ptr2 = list.size()-1;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;

        pairSum(list, target);
    }
}