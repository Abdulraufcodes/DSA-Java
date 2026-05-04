public class factOfNumb{
    public static int calcfact(int n){
        if(n ==1 || n==0){
            return 1;
        }
        int fact_nm1 = calcfact(n-1);
        int fact_n = n* fact_nm1;            //in this method all the things are stored in a different variables
        return fact_n;                       //apna college lecture code(logic is same)
    }
    public static void main(String[] args){
        int n=5;
        int ans = calcfact(n);
        System.out.println(ans);
    }
   /*  public static int calcfact(int n){
        if(n ==1 || n==0){
            return 1;                       //chatgpt method(logic is same)
        }
       return n* calcfact(n-1);
    }
    public static void main(String[] args){
        System.out.println(calcfact(5));
    } */
}