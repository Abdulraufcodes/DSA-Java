public class App {
    public static int count(int nums[], int num, int lo, int hi){
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    }
    public static int majelement(int nums[], int lo, int hi){
        //base case if single element is left
        if(lo == hi){
            return lo;
        }

        //mid 
        int mid = lo + (hi-lo)/2;

        //dividing in left and right part from mid
        int left = majelement(nums, lo, mid);
        int right = majelement(nums, mid+1, hi);

        //if left and right give the same element
        if(left == right){
            return left;
        }

        //if left and right give different elements
        //Note: at end the majority element will be returned even if lower levels return different element
        int leftcount = count(nums, left, lo, hi);
        int rightcount = count(nums, right, lo, hi);

        //whichever has the highest count in the array is returned
        return leftcount > rightcount ? left : right;
    }
    public static void main(String[] args) throws Exception {
        int nums[] = {2,2,1,1,1,2,1};
        System.out.println(majelement(nums, 0, nums.length-1));
    }
}

