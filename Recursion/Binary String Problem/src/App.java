public class App {
    // IMP : see how it was wrong with Stringbuilder
    //n to track size, lastDigit to check last, str to append
    public static void printBinString(int n, int lastDigit, String str){ 

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        if(lastDigit == 0){
            //place 0 or 1
            printBinString(n-1, 0, str+"0");
            printBinString(n-1, 1, str+"1"); //adding 1 and then making it lastdigit
        }else{
            printBinString(n-1, 0, str+"0");
        }

        //short version
        // printBinString(n-1, 0, str+"0");  //this is always going to occur
        // if(lastDigit == 0){
        //     printBinString(n-1, 1, str+"1");
        // }
    }
    public static void main(String[] args) throws Exception {
        printBinString(3, 0, "");
    }
}
