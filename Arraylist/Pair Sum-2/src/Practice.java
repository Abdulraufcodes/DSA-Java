import java.util.ArrayList;

public class Practice {

    public static boolean pairSum(ArrayList<Integer> list, int target){
        int bp = -1;  //breaking point - where the list breaks
        int n = list.size();

        for(int i=0; i<n; i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;  //breaking point is at element 15
                break;
            }
        }

        //note in [11,15,6,8,9,10] lp is at 6(as it is lowest) and rp is at 15(as it is highest)
        int rp = bp; //right pointer
        int lp = bp+1;  //left pointer

        //finding the sum
        while (lp != rp) {

            //case 1: sum of elemts at lp and rp = target
            if(list.get(lp) + list.get(rp) == target){
                return true;
            }

            //--------NOTE: MODULAR ARITHMEIC USED------------
            //case 2: sum of elemts at lp and rp < target
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp + 1) % n;
            }else{
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    // ===== APPROACH =====
    // Use two pointers:
    // find breaking point
    // find sum (use modular arithmetic)
    // Time Complexity: O(n)
    // ====================

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 15;

        System.out.println(pairSum(list, target));
    }
}