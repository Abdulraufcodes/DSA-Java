public class App {
    public static boolean isPoweroftwo(int n){
        int result = n & (n-1);
        if(result == 0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) throws Exception {
        System.out.println(isPoweroftwo(4));
    }
}
