public class App {

    // brute force approach
    // public static void maxsum(int nums[]){
    // int currsum = 0;
    // int maxsum = Integer.MIN_VALUE; //min value is minus infinity

    // for(int i=0; i<nums.length; i++){
    //      int start = i;
    //      for(int j=i; j<nums.length; j++){
    //          int end = j;
    //          currsum = 0; //initializing currsum to 0 after every sum
    //          for(int k=start; k<=end; k++){
    //              currsum += nums[k];
    //          }
    //          System.out.println(currsum);
    //          if(currsum > maxsum){
    //              maxsum = currsum ;
    //          }
    //      }
    // }
    // System.out.println("max sum is: "+ maxsum);
    // }

    // prefix array method
    // public static void maxsum(int nums[]) {
    //     int currsum = 0;
    //     int maxsum = Integer.MIN_VALUE;

    //     //making prefix array
    //     int prefix[] = new int[nums.length];
    //     prefix[0] = nums[0];
    //     for(int i=1; i<prefix.length; i++){
    //         prefix[i] = prefix[i-1] + nums[i];
    //     }

    //     for(int i=0; i<nums.length; i++){
    //         int start = i;
    //         for(int j=i; j<nums.length; j++){
    //             int end = j;
    //             currsum =start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                
    //             if(currsum > maxsum){
    //                 maxsum = currsum;
    //             }
    //         }
    //     }
    //     System.out.println("max sum is: "+ maxsum);
    // }

    //works only when there is atleast 1 positive value
    public static void kandanes(int nums[]){
        int cs = 0; //currsume
        int ms = Integer.MIN_VALUE;  //maxsum

        for(int i=0; i<nums.length; i++){
            cs = cs + nums[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);  //finding maximum
        }
        System.out.println("our maximum subarray sum is : " + ms);
    }

    //works for every case
    public static void kandanes2(int nums[]){
        int cs = nums[0];
        int ms = nums[0];

        for(int i=1; i<nums.length; i++){
            cs = Math.max(cs, cs+nums[i]);
            ms = Math.max(ms, cs);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) throws Exception {
        int nums[] = { -1,-2,-6,-1,-3};
        // maxsum(nums);
        // kandanes(nums);
        kandanes2(nums);
    }
}
