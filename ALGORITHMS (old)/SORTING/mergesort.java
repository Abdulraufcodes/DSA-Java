public class mergesort{
    public static void conquer(int arr[], int si, int mid, int ei){
        int[] merged = new int[ei -si +1];//+1 because index starts from 0 and we need length

        int idx1 = si;//this will track 1st array
        int idx2 = mid+1;//this will track 2nd array
        int x = 0;//this will track merger array

        while(idx1 <= mid && idx2 <=ei){//this will work only while comparing 2 arr and not when elem. in one arr are remaining
            if(arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++; idx1++;
            }else {
                merged[x++] = arr[idx2++];//increaing x and idx in same line
            }
        }

        while(idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        //only one while loop will run as one will always be false due to end of one array
        while(idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++,j++){ //copying elements of merged array into origional array
            arr[j] = merged[i]; 
        }
    }

    public static void divide(int arr[],int si, int ei){
        //base case
        if(si >= ei){
            return;//this base case stops division after single elment 
        }

        int mid = si + (ei-si)/2; //not (si+ei)/2 as it can sometimes excede integer range
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);

    }
    public static void main(String[] args){
        int arr[] = {6, 3, 9, 5, 2, 8};
        int n = arr.length; 

        divide(arr, 0, n-1);
        //print
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}