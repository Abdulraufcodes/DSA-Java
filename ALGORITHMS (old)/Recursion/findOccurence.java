public class findOccurence{
       //time complexity=O(n)
    public static int first = -1;//-1 is taken because we will get confuse btw initialize value and index
    public static int last = -1;//-1 is taken because we will get confuse btw initialize value and index
    public static void findOccurence(String str, int index, char element){
        if (index == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currchar = str.charAt(index);
        if (currchar == element){
            if(first == -1){  //once first 'a' is found it will be updated as index and
                first = index;//it will no longer be -1 so whenever another 'a' comes it will jump to
            }else{            //else statement
                last = index;
            }
        }
        findOccurence(str, index+1, element);
    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        char element = 'a';
        findOccurence(str, 0, element);
    }
}