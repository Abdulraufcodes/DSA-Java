public class App {
    //print function
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    //function to merge sort
    public static void mergesort(int arr[], int si, int ei){
        //base case when there is only 1 element left
        if(si>=ei){
            return;
        }

        int mid = si + (ei-si)/2;
        mergesort(arr, si, mid);
        mergesort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //for eg. left(0,3) and right(4,6) -> 6-0+1 = 7(equal to sum of both elements)
        int temp[] = new int[ei-si+1];

        int i = si;  //iterator to track left elements for comparision 
        int j = mid+1;  //iterator to track left elements for comparision 
        int k = 0;  //iterator for indices of temp arr

        while(i<=mid && j<=ei){

            //if left side element is bigger
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++ ; k++;
            }else{
                temp[k] = arr[j];
                j++; k++;
            }
        }

        //adding element if one array ends as above condition is &&
        //for left side elements
        while(i <= mid){
            temp[k] = arr[i];
            i++; k++;
        }
        //for right side elements
        while(j <= ei){
            temp[k] = arr[j];
            j++; k++;
        }

        //copying temp to origioanl arr
        for(k=0,i=si ; k<temp.length; k++,i++){
            arr[i] = temp[k];
        }

    }
    public static void main(String[] args) throws Exception {
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printarr(arr);
    }
}
