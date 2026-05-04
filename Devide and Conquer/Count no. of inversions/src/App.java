public class App {
    public static int merge(int arr[], int left, int mid, int right){

        int invcount = 0;

        int temp[] = new int[right-left+1];

        int i = left;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=right){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                k++;i++;
            }
            //if arr[i]>arr[j] - condition for inversion
            else{
                temp[k] = arr[j];
                invcount += mid-i+1;  //adding all the inversions to the right of i including i
                k++;j++;
            }
        }

        while(i<=mid){
            temp[k] = arr[i];
            k++;i++;
        }

        while(j<=right){
            temp[k] = arr[j];
            k++;j++;
        }

        //very imp as original arr in further recursion will be unaltered and will give incorrect answers
        for(k=0,i=left; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

        return invcount;
    }
    public static int mergesort(int arr[], int left, int right){
        int invcount = 0;

        if(right > left){
            int mid = (left + right)/2;

            invcount += mergesort(arr, left, mid);
            invcount += mergesort(arr, mid+1, right);
            invcount += merge(arr, left, mid, right);
        }
        return invcount;
    }
    public static int getInversions(int arr[]){
        return mergesort(arr, 0, arr.length-1);
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {5, 4, 3, 2, 1};
        System.out.println("no of inversions: " + getInversions(arr));
    }
}
