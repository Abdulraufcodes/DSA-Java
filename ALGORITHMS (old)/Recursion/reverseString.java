public class reverseString{
    public static void printString (String str, int index){
        if (index == 0){
            System.out.println(str.charAt(index));
            return;                                   //as stack heigh depends on string length so
        }                                             //time complexity = O(n)
        System.out.print(str.charAt(index));
        printString(str, index-1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printString(str, str.length()-1);
    }
}
  