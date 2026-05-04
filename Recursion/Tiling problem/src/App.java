public class App {
    public static int tiling(int n){ //2 x n (floor size)
        if(n == 0 || n==1){
            return 1;
        }

        //vertical placement
        int fnm1 = tiling(n-1);

        //horizontal placement
        int fnm2 = tiling(n-2);

        int total = fnm1 + fnm2;

        return total;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(tiling(4));
    }
}
