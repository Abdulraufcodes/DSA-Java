import java.util.ArrayList;

public class TwoPointers {

    public static int maxWater(ArrayList<Integer> height){

        int ptr1 = 0;
        int ptr2 = height.size()-1;

        int max = Integer.MIN_VALUE;
        
        while (ptr1<ptr2) {
            
            //calculating water
            //area = width * height(which ever is smaller)
            int area = (ptr2-ptr1) * Math.min(height.get(ptr1), height.get(ptr2));
            max = Math.max(max, area);

            //logic to move pointers : always move the smaller one as it decides the water stored
            if(height.get(ptr1)<height.get(ptr2)){
                ptr1++;
            }else{
                ptr2--;
            }

        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        //test Arraylist
        // height.add(5);
        // height.add(4);
        // height.add(3);
        // height.add(2);
        // height.add(1);

        System.out.println(maxWater(height));
    }
}
