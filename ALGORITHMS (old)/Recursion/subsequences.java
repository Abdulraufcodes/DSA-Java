public class subsequences{
     public static void printsub(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        //if character wants to be included
        printsub(str,idx+1,newString+currChar);

        //if character does not want to be included
        printsub(str,idx+1,newString);
    } 
   
    public static void main (String args[]){
        String str = "abc";
        printsub(str,0,"");
    }
}