public class Quicksort {
    public static int partition(int arr[], int low, int high) { //this function will give index of pivot so 'int' is used 
        int pivot = arr[high];
        int i = low-1;//-1 is used as no idx is checked yet
        for (int j=low; j<high; j++) {//j is used as i is already used above & high is not included as last element is pivot
            if(arr[j] < pivot) {//if pivot is less so swap it with 1st elemtnt
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;//this will create space for pivot 
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;//pivot idx
    }

    public static void quicksort(int arr[], int low, int high) {
        
        if(low < high) {
            int pidx = partition(arr, low, high);//pidx = pivot index

            quicksort(arr, low, pidx-1);//it will move all elements smaller than pivot to left of it
            quicksort(arr, pidx+1, high);//it will move larger element to right of it
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length;

        quicksort(arr, 0, n-1);//n-1 because of length
        //print
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}