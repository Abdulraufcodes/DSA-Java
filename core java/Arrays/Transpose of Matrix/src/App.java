public class App {

    public static void transpose(int arr[][]){
        int row = arr.length, col = arr[0].length;

        int transpose[][] = new int[col][row];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = arr[i][j];
            }
        }
        System.out.println();
        print(transpose);
    }

    public static void print(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        int[][] arr= { {2,3,7}, 
                       {5,6,7} };

        print(arr);
        transpose(arr);
    }
}
