public class App {
    public static int clearIbits(int n, int i){
        int bitmask = (~0) << i;
        return n & bitmask;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(clearIbits(15, 2));
    }
}
