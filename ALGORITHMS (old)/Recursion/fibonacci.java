public class fibonacci{
     public static void printfib(int a, int b, int n){
        if(n ==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printfib(b, c, n-1); //n-1 as 1 term i.e c is printed already & a=b,b=c for next term
    }
    public static void main(String[] args){
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printfib(a, b, n-2); //n-2 as 2 numbers are already printed
    } 


   /* public static int printfib(int n){
    if(n <= 1){
        return n;
    }
    return printfib(n-1) +printfib(n-2);
   }
   public static void main(String args[]){              //chatgpt answer
    int n= 10;
    for (int i=0; i<n; i++){
        System.out.print(printfib(i) + " ");
    }
   } */
}