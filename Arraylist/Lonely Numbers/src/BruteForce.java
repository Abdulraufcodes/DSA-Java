import java.util.ArrayList;

public class BruteForce {
    public static void lonelyNums(ArrayList<Integer> list, ArrayList<Integer> ans){
        
        int n = list.size();
        

        for(int i=0; i<n; i++){
            boolean islonely = true;
            for(int j=0; j<n; j++){
                if(i!=j && list.get(i)==list.get(j)){
                    islonely = false;
                }
                if(list.get(j) == list.get(i)+1 || list.get(j) == list.get(i)-1 ){  //no need to check i==j as list(i)==(j) will give false and does not affect islonely
                    islonely = false;
                }
            }
            if(islonely){
                ans.add(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);

        lonelyNums(list,ans);
        System.out.print(ans);
    }
}
