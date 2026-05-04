public class App {
    public static int findSingle(int arr[]){
        int xor = 0;
        //logic: we take the xor of all elements and duplicate will eleminate each other as a^a=0
        for(int i=0; i<arr.length; i++){
            xor = xor ^ arr[i]; 
        }
        return xor;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {1};
        System.out.println(findSingle(arr));
    }
}
