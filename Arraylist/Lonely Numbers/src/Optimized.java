import java.util.ArrayList;
import java.util.Collections;

public class Optimized {
    public static ArrayList<Integer> findlonely(ArrayList<Integer> nums){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.size();

        // 1. Sort Arraylist
        Collections.sort(nums);

        // 2. check if repeatin, x+1 or x-1 exits
        //from 1 to last second elements and we check left and right of every element
        for(int i=1; i<n-1; i++){
            if(nums.get(i)-nums.get(i-1)>1 && nums.get(i+1)-nums.get(i)>1){
                list.add(nums.get(i));
            }
        }

        // 3. if list has only 1 element
        if(nums.size() == 1){
            list.add(nums.get(0));
        }

        // 4. checking if 1st and last element are lonely or not
        if(nums.size() > 1){
            //for first element: compare difference of 1st and 2nd element
            if(nums.get(1)-nums.get(0) > 1){
                list.add(nums.get(0));
            }
            //for last element: compare difference of last and second last element
            if(nums.get(nums.size()-1)-nums.get(nums.size()-2) > 1){
                list.add(nums.get(nums.size()-1));
            }
        }

        //return the final list of lonely nums
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(8);
        nums.add(20);
        nums.add(21);
        nums.add(30);

        System.out.println(findlonely(nums));
    }
}
