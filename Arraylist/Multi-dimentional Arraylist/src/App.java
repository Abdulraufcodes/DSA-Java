import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();  //making mainlist that stores other arraylist

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();   //making 3 arraylist
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list.add(i*1);
            list1.add(i*2);   //adding elements to all 3 lists
            list2.add(i*3);
        }

        mainlist.add(list);
        mainlist.add(list1);  //adding all 3 list to mainlist
        mainlist.add(list2);

        //this will just give an arraylist of arraylist not all the element in matrix form
        System.out.println(mainlist);

        //logic : take one arraylist from mainlist and traverse it and then take the other arraylist
        for(int i=0; i<mainlist.size(); i++){
            ArrayList<Integer> currlist = mainlist.get(i);  //getting one list from mainlist one by one
            for(int j=0; j<currlist.size(); j++){
                System.out.print(currlist.get(j)+" ");  //traversing over a single list
            }
            System.out.println();
        }

    }
}
