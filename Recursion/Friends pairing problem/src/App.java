public class App {
    public static int pairfrinds(int n){
        if(n==0 || n==1){
            return 1;
        }

        //single
        int fnm1 = pairfrinds(n-1);

        //pair
        int fnm2 = pairfrinds(n-2);
        int pairways = (n-1) * fnm2;

        //total
        int totalways = fnm1 + pairways;
        return totalways;

        //short code
        // return pairfrinds(n-1) +  (n-1) * pairfrinds(n-2) ;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(pairfrinds(4));
    }
}
