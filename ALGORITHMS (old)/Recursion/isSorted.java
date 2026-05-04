public class isSorted{  //stricktly increasing array means next number should increae  
      //time complexity: O(n) 
     public static boolean isSorted(int arr[],int index){
        if(index == arr.length-1){//length-1 becz last element will be compared to next element that does not exist
            return true;
        }
         if(arr[index]<arr[index+1]){                   
            return isSorted( arr,  index+1);         
        }else{                                         
            return false;                              
        }         
        //optimized method
       /*  if (arr[index]>=arr[index+1]){
            return false;
        }       
        return isSorted(arr,index+1);   */                           
    }
    public static void main(String args[]){
        int arr[] = {1,3,7};
        System.out.println(isSorted(arr, 0));
    }
    
}