import java.util.*;

public class App {
    public static void print(String arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergesort(String arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        
        mergesort(arr,si,mid);
        mergesort(arr,mid+1,ei);
        
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        
        while(i<= mid && j<=ei){
            if(arr[i].compareTo(arr[j]) <= 0){  //imp part for comparision
                temp[k] = arr[i];
                k++;i++;
            }
            else{
                temp[k] = arr[j];
                k++;j++;
            }
        }
        
        while(i<=mid){
            temp[k] = arr[i];
            k++;i++;
        }
        
        while(j<=ei){
            temp[k] = arr[j];
            k++;j++;
        }
        
        for(k=0,i=si;k<temp.length; k++,i++){  //remember to start i from si
            arr[i] = temp[k];
        }
        
    }
    public static void main(String[] args) throws Exception {
        String arr[] = {"sun", "earth", "mars", "mercury"};
        mergesort(arr,0,arr.length-1);
        print(arr);
    }
}
