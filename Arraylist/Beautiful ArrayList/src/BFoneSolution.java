import java.util.ArrayList;

public class BFoneSolution {
    public static boolean isBeautiful(ArrayList<Integer> curr){
        int n = curr.size();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=i+1; k<j; k++){
                    if(2*curr.get(k) == curr.get(i) + curr.get(j)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static boolean makeList(ArrayList<Integer> curr, boolean used[], int n){
        //base case when all elements are used
        if(curr.size() == n){
            if(isBeautiful(curr)){
                System.out.println(curr);
                return true;
            }
            return false;
        }

        for(int i=1; i<=n; i++){

            if(!used[i]){
                //choose a num
                curr.add(i);
                used[i] = true;

                if(makeList(curr, used, n)){
                    return true;
                }
                

                curr.remove(curr.size()-1);
                used[i] = false;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 3;

        ArrayList<Integer> curr = new ArrayList<>();
        boolean used[] = new boolean[n+1];

        makeList(curr,used,n);
    }
}
