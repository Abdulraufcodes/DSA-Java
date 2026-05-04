public class callGuest{
    public static int callGuest(int n){
        if( n== 1){
            return 1;
        }
        if (n == 0){
            return 1;
        }
        //singles
        int way1 = callGuest(n-1);
        //in pairs
        int way2 = (n-1) * callGuest(n-2);
        //total ways
        return way1 + way2;
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(callGuest(n));
    }
}