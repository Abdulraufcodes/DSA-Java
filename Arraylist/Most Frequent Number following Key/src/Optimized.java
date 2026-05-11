import java.util.ArrayList;

public class Optimized {
    public static int mostFreqNum(ArrayList<Integer> list, int key){
        int result[] = new int[1000];

        for(int i=0; i<list.size()-1; i++){  //till second last element as we are checking the target after the key
            if(list.get(i) == key){
                result[list.get(i+1)]++;  //incrementing index = target;
            }
        }

        int max = Integer.MIN_VALUE;   //writing them outside as we dont want to reset to 0 after every iteration
        int ans = 0;  

        //finding the max freq and making the index with highest freq ans
        for(int i=0; i<1000; i++){
            if(result[i] > max){
                max = result[i];
                ans = i;\
            }
        }

        return ans;
    }

    //-------Approach-----
    //make a freq array
    //store the count on the index as the value of target
    //iterate this freq array and find the index with the most count 
    //this element will be the answer
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
