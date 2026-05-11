import java.util.ArrayList;

public class BruteForce {
    public static int mostFreqNum(ArrayList<Integer> list, int key) {
        int n = list.size();
        int ans = -1;  
        int maxcount = 0;  //both ans and maxcount are final and should not be changed on every iteration so they are declared outside

        for (int i = 0; i < n - 1; i++) {  //outer loop finds a target 
            int target = 0;  
            int count = 0;
            if (list.get(i) == key) {  //finding target 
                target = list.get(i + 1);
            }

            for (int j = 0; j < n - 1; j++) {  //inner loop finds the count of occurance of the target selected by outer loop
                if (list.get(j) == key && list.get(j + 1) == target) {  //condition when target is found
                    count++;
                    System.out.println("Found : " + key + " -> " + target +" | index = " + j +" | count = " + count);
                }
            }

            if (count > maxcount) {   //updating ans and maxcount
                ans = target;
                maxcount = count;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(1);
        list.add(2);

        int key = 1;

        System.out.println(mostFreqNum(list, key));
    }
}