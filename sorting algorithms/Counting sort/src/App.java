//all sorting example below for descending

public class App {

    public static void countSort(int[] arr){
        int largest = Integer.MIN_VALUE; //to find the length of frequency arry
        //finding largest elem.
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        //making array to store freq. and size is +1 as it will include '0'
        int count[] = new int[largest+1];

        //this will update freq of every element
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++; //eg. arr[0]=1 so count[1] will update
        }

        //sorting
        int j=0; //to track the original array
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {  //till freq becomes 0
                arr[j] = i; //updating origina array to indices of count as indeces are elements
                j++; //moving to next index in original array
                count[i]--;  //updating freq of element 
            }
        }
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) throws Exception {
        // int arr[] = {5,4,1,3,2};
        int arr[] = {1,2,1,3,2,4,3,7};
        countSort(arr);
        printArr(arr);
    }
}
/*
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int arr[]){
        
        for(int i=0; i<arr.length; i++){
        int smallest = i;
            for(int j=i; j<arr.length; j++){
                if(arr[j]>arr[smallest]){
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
    
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int curr =arr[i] ;
            int prev = i-1;
            while(prev>=0 && curr>arr[prev]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    
    public static void countinSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        
        int count[] = new int[largest+1];
        
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
            
        int j =0;
        for(int i=count.length-1; i>0; i--){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    
    public static void printarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        countinSort(arr);
        printarr(arr);
    }
}
*/
