//logic : pehle aage badhte raho aur phir piche aate hue dhundo

public class App {
    public static int lastOcc(int arr[], int key, int i){
        if(i == arr.length){
            return -1;    //when length is reached -1 is going to be returned to the lower stacks
        }
        int isfound = lastOcc(arr,key, i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) throws Exception {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.print(lastOcc(arr,key,0));
    }
}
