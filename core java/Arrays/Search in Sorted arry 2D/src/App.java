public class App {

    public static void search(int arr[][], int key){
        int row = 0, col = arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col] == key){
                System.out.println("key at ("+row+","+col+")");
                return;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("key not found");
    }
    public static void main(String[] args) throws Exception {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};

        search(matrix, 15);
    }
}
