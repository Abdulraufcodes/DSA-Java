public class removedup{
    //Time complexity : O(n)
    public static boolean[] map= new boolean[26];//26 as there are 26 alphabet
   public static void removedup(String str, int idx,String newString){
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar-'a'] == true){//currChar -'a' will give integer value of index(refer notes)
        removedup(str,idx+1,newString);
    }else{
        newString += currChar;
        map[currChar-'a'] = true;
        removedup(str,idx+1,newString);       
    }
   }
   public static void main(String args[]){
    String str = "abbccda";
    removedup(str,0,"");
   }
}
