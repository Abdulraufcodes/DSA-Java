public class App {
    public static int search(int arr[], int target, int si, int ei){
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si)/2;

        if(mid == target){
            return mid;
        }

        //if target on L1
        if(arr[si] <= arr[mid]){
            //left of L1
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }
            //right of L1
            else{
                return search(arr, target, mid+1, ei);
            }
        }

        //if target on L2
        else{
            //right of L2
            if(arr[mid]<=target && target<=arr[ei]){
                return search(arr, target, mid+1, ei);
            }
            //left of L2
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr,target,0,arr.length-1));
    }
}
