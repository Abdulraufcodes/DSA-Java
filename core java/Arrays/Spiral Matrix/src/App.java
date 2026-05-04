
//both kind of for loop are correct 

class Main {
    public static void spiral(int arr[][]){
        int startrow = 0;
        int endrow = arr.length-1;
        int startcol = 0;
        int endcol = arr[0].length-1;
        while(startrow <= endrow && startcol <= endcol){
            //top
            for(int i=startcol; i<endcol; i++){
                System.out.print(arr[startrow][i]+" ");
            }
            //right
            for(int i=startrow; i<endrow; i++){  //for(int i=startrow+1; i<=endrow; i++) (video)
                System.out.print(arr[i][endcol]+" ");
            }
            //bottom
            for(int i=endcol; i>startcol; i--){  //for(int i=endcol-1; i>=startcol; i--) (video)
                //condition if the arr is only a row as it will print twice if this condition is not there
                if(startrow == endrow){ 
                    break;  
                }
                System.out.print(arr[endrow][i]+" ");
            }
            //left
            for(int i=endrow; i>startrow; i--){  //for(int i=endrow-1; i>startrow+1; i--) (video)
                //condition if the arr is only a col as it will print twice if this condition is not there
                if(startcol == endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
    }
    
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,17},
                       {5,6,7,8,18},
                       {9,10,11,12,19},
                       {13,14,15,16,20}};
        
        spiral(arr);
        
    }
}