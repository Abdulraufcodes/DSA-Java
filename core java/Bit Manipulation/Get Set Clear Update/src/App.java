public class App {
    public static int getBit(int n, int pos){
        int bitmask = 1<<pos;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setBit(int n, int pos){
        int bitmask = 1<<pos;
        int result = n | bitmask;
        return result;
    }

    //see notes to understand
    public static int clearBit(int n, int pos){
        int bitmask = 1<<pos;
        int notBitmask = ~(bitmask);

        return n & notBitmask;
    }

    public static int updateBit(int n, int pos, int bit){
        //normal approach
        // if(bit == 0){
        //     return clearBit(n, pos);
        // }else{
        //     return setBit(n, pos);
        // }

        //alternate
        n = clearBit(n, pos);
        int bitmask = bit<<pos;
        return n | bitmask;
    }
    public static void main(String[] args) throws Exception {
        // System.out.println(getBit(10, 3)); //10= 1010
        //System.out.println(setBit(10, 2)); //10=1010 1110=14
        // System.out.println(clearBit(10, 1));
        System.out.println(updateBit(10, 2, 1));
    }
}
