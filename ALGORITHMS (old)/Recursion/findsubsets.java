import java.util.*;
public class findsubsets{
    public static void printsubset(ArrayList<Integer> subset){//this function is to print arraylist
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i) + " ");
        }
       System.out.println();
    }
    public static void findsubsets(int n, ArrayList<Integer> subset){
        if(n == 0){
            printsubset(subset);
            return;
        }
        //add hoga
        subset.add(n);
        findsubsets(n-1,subset);
        //add nahi hoga
        subset.remove(subset.size()-1);//whatever number we stored above will be at last index so we have to remove it from the last index
        findsubsets(n-1,subset);
    }
    public static void main(String args[]){
        int n = 3;
        ArrayList<Integer> subset= new ArrayList <>();
        findsubsets (n,subset);
    }
}