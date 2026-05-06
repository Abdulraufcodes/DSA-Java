import java.util.ArrayList;

public class Optimized {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int ptr1 = 0;
        int ptr2 = list.size()-1;

        while (ptr1 != ptr2) {
            if((list.get(ptr1) + list.get(ptr2)) == target){
                return true;
            }

            //logic for pointer
            if(list.get(ptr1) + list.get(ptr2) < target){
                ptr1++;  //this will give bigger values as arraylist is sorted
            }else{
                ptr2--;  //this will give smaller values as arraylist is sorted
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //Note: list is sorted
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        System.out.println(pairSum(list, target));
    }
}
