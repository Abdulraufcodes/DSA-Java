public class App {
    public static int xpn(int x, int n){
        if(n==0){
            return 1;
        }
        return x * xpn(x,n-1);
    }

    public static int optimizedxpn(int x, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimizedxpn(x,n/2);
        int halfpowersq = halfpower * halfpower;

        //n is odd
        if(n%2 != 0){
            halfpowersq = x * halfpowersq;
        }

        return halfpowersq;
    }
    public static void main(String[] args) throws Exception {
        int x=2 , n=10;
        // System.out.print(xpn(x,n));
        System.out.println(optimizedxpn(x, n));
    }
}
