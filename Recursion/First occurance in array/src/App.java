public class App {
    public static int firstocc(int arr[], int key, int i){
        if(i == arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstocc(arr,key,i+1);
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.print(firstocc(arr,key,0));
    }
}
