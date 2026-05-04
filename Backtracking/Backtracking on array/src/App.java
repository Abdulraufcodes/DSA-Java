public class App {
    public static void changearr(int arr[], int idx, int val){
        //base case
        if(idx == arr.length){
            print(arr);
            return;
        }

        //storing val at index
        arr[idx] = val;
        //recursion
        changearr(arr, idx+1, val+1);
        //BT
        arr[idx] = arr[idx] - 2;
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        int arr[] = new int[5];
        changearr(arr, 0, 1);
        print(arr);
    }
}
