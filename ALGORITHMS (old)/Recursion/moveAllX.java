public class moveAllX{
    //time complexity: string length+for loop =O(2n)=O(n)
    public static void moveAllX(String str, int idx,int counter,String newString){//idx = index
        if(idx == str.length()){
            for(int i=0; i<counter; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if(currChar == 'x'){
            counter++;
            moveAllX(str,idx+1,counter,newString);
        }else{
            newString+= currChar;
            moveAllX(str,idx+1,counter,newString);
        }
    }
    public static void main(String args[]){
        moveAllX("axbcxxd",0,0,"");
    }
}