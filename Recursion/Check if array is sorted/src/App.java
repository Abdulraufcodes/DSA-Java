public class App {
    public static boolean isSorted(int arr[], int i){

        //when comparision reaches arr.length-1 then it is sorted
        if(i == arr.length-1){
            return true;
        }
        //condition if not sorted
        if(arr[i]>arr[i+1]){
            return false;
        }

        //to check if preceeding elements are sorted
        return isSorted(arr, i+1);
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1,2,7,4,5};
        System.out.println(isSorted(arr, 0));
    }
}
