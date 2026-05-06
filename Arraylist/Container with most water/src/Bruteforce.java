import java.util.ArrayList;;

public class Bruteforce{

    public static int maxWater(ArrayList<Integer> height){

        int max = Integer.MIN_VALUE;

        for(int i=0; i<height.size(); i++){
            for(int j=i; j<height.size(); j++){
                int area = (j-i) * Math.min(height.get(i), height.get(j));
                max = Math.max(max, area);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        // height.add(1);
        // height.add(8);
        // height.add(6);
        // height.add(2);
        // height.add(5);
        // height.add(4);
        // height.add(8);
        // height.add(3);
        // height.add(7);

        //test Arraylist
        height.add(5);
        height.add(4);
        height.add(3);
        height.add(2);
        height.add(1);

        System.out.println(maxWater(height));
    }
}