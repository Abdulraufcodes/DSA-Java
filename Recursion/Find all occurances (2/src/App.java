public class App {
    public static void findallocc(int arr[], int key, int idx){
        if(idx==arr.length-1){
            if(arr[idx]==key){
                System.out.println(idx);
            }
            return;
        }
        if(arr[idx] == key){
            System.out.println(idx);
            findallocc(arr, key, idx+1);
        }else{
            findallocc(arr, key, idx+1);
        }
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        findallocc(arr, key, 0);
    }
}
