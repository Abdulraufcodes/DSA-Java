public class ActualSolution {

    public static void findPath(int maze[][], int sol[][], int row, int col){
        int n = maze.length;

        //out of bound condition
        if(row<0 || row>=n || col<0 || col>=n){
            return;
        }

        //if blocked or already visited(sol array)
        if(maze[row][col] == 0 || sol[row][col] == 1){
            return;
        }

        //base case(when it reaches destination)
        if(row == n-1 && col == n-1){
            //mark visited(in sol array)
            sol[row][col] = 1;
            //print
            print(sol);
            //restore visited to origional
            sol[row][col] = 0;
            return;
        }

        //mark visited
        sol[row][col] = 1;

        findPath(maze, sol, row+1, col);
        findPath(maze, sol, row, col+1);
        findPath(maze, sol, row-1, col);
        findPath(maze, sol, row, col-1);

        //Restore the original value after recursion
        sol[row][col] = 0;
    }

    public static void print(int arr[][]){
        System.out.println("-----Path-----");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int maze[][] = { { 1, 1, 1, 1 },
                         { 0, 1, 0, 1 },
                         { 1, 1, 1, 1 },
                         { 1, 0, 1, 1 } };

        int N = maze.length;
        int sol[][] = new int[N][N];

        findPath(maze, sol, 0, 0);
    }
}
