public class recursion{
    public static void printNumb(int n){
        //base case
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);//calling itself
    }
    public static void main(String[] args){
        int n=5;
        printNumb(n);//calling function
    }
}