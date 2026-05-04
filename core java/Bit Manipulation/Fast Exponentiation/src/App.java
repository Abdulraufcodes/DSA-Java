public class App {
    public static int fastExpo(int a, int n){  //we use power in binary form 3 = 011
        int ans = 1;
        //basically we only multiply number if LSB is one 
        while(n>0){
            if((n & 1) != 0){ //check LSB
                ans = ans * a;  //multiplying number to ans
            }
            a = a * a;  //sqaring everytime as we are going to left of bits
            n = n>>1;  //right shifting bits
        } 
        return ans;
    }
    public static void main(String[] args) throws Exception {
        System.out.println(fastExpo(5, 3));
    }
}
