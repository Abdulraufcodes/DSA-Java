public class App {

    // function to find the correct side(left or right) to sort
    public static int search(int nums[], int target) {
        int min = minsearch(nums); //this will find the minimum element
        // find in sorted right
        if (nums[min] <= target && target <= nums[nums.length - 1]) {
            return search(nums, min, nums.length - 1, target);
        }
        // find in sorted left
        else {
            return search(nums, 0, min, target);
        }
    }

    // function to binary search in correct half
    public static int search(int nums[], int left, int right, int target) {

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }
            else if(target < nums[mid]){
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        return -1;
    }

    // functin to find the pivot index from where the array is rotated
    public static int minsearch(int nums[]) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            // the first condi. checks if array has any elements in it and another condi. is
            // to check if element before mid is greater than mid finding the pivot index
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                return mid;
            }
            // the first condition checks if the left of mid is sorted and other condition
            // checks if the right side is unsorted so the pivot must lie on right side
            else if (nums[left] < nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1; //as the left half is sorted the smallest elem. must be on the right so we make mid+1 left
            } else {
                right = mid - 1;
            }
        }
        return left; // eventually only one element will be there so you can return left or right
                     // both are same
    }

    public static void main(String[] args) throws Exception {
        int nums[] = {4,  5, 6, 7, 0, 1, 2};
        int target = 6;
        System.out.println("index is:"+search(nums,target));
    }
}
