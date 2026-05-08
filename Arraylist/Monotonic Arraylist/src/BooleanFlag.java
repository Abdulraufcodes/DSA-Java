import java.util.ArrayList;

public class BooleanFlag {
    public static boolean isMonotonic(ArrayList<Integer> list){
        int n = list.size();

        boolean inc = true;    //two boolean flags are used to track
        boolean dec = true;    //if inc than dec cant be true and vice versa

        for(int i=0; i<n-1; i++){
            if(list.get(i) < list.get(i+1)){
                dec = false;   //i and i+1 is inc so dec is false
            }
            else if(list.get(i) > list.get(i+1)){
                inc = false;   //i and i+1 is dec so inc is false
            }
        }

        if(inc == false && dec == false){   //if both false than the list is following no trend
            return false;
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println(isMonotonic(list));
    }
}
