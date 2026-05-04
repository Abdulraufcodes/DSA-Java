public class App {
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quicksort(int arr[], int low, int high){
        if(low < high){  //condition if low does not exceed high
            //getting the index of pivot
            int pidx = pivot(arr, low, high); 
            
            quicksort(arr, low, pidx-1); //left side of pivot
            quicksort(arr, pidx+1, high); //right side of pivot
        }
    }

    public static int pivot(int arr[], int low, int high){
        int pivot = arr[high]; //last element as pivot
        int i = low-1; //low-1 = -1 (to make space for swping elements)

        for(int j=low; j<high; j++){  //j to track the origional array
            if(arr[j] < pivot){
                i++;
                //swapping with smaller element than pivot
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //placing the pivot at correct place after placing all small elemets to the left

        i++; //incrementing index to place pivot after all small elements
        //swapping
        int temp = arr[i];
        arr[i] = arr[high];  //here use arr[high] instead of pivot as pivot stores a copy and does not update the origional array
        arr[high] = temp;
        return i;

    }
    public static void main(String[] args) throws Exception {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        quicksort(arr, 0, n-1);
        printarr(arr);
    }
}
 