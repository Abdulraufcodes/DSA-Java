public class App {
    public static void main(String[] args) throws Exception {
        int n=7;
        int bitmask = 1;
        if((n & bitmask)==0){
            //even
            System.out.println("is even");
        }else{
            System.out.println("is Odd");
        }
    }
}
