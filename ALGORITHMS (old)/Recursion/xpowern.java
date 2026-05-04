public class xpowern{

     // stack height = log n
     public static int printPower(int x, int n) {
        if(n == 0) {
        return 1;
        }
        //if n is even
        if(n % 2 == 0) {
        return printPower(x, n/2) * printPower(x, n/2);
        }
        else {//if n is odd
        return x * printPower(x, n/2) * printPower(x, n/2);
        }
        }
        public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
        }

              //stack height = n
   /*  public static int calcpower(int x, int n){
        if(n == 0){ //base case 1
            return 1;
        }
        if(x ==0){ //base case 2
            return 0;
        }
        int xPowNm1 = calcpower(x, n-1); 
        int xPowN = x * xPowNm1;
        return xPowN;
    }
    public static void main(String args[]){
        int x=2, n=4;
        int ans = calcpower(x, n);
        System.out.println(ans);
    } */
    
}