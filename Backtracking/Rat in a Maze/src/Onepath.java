public class Onepath {

    public static boolean onePath(int maze[][], int sol[][], int row, int col){
        int n = maze.length;

        //out of bound condition
        if(row<0 || row>=n || col<0 || col>=n){
            return false;
        }
        //blocked or visited
        if(maze[row][col] == 0 || sol[row][col] == 1){
            return false;
        }
        //when destination reached
        if(row==n-1 && col==n-1){
            sol[row][col] = 1;  //mark visited(in sol array)
            print(sol);
            // sol[row][col] = 0;  no backtrack as we only need one path
            return true;
        }

        //mark as visited
        sol[row][col] = 1;
        //recursion
        if(onePath(maze, sol, row+1, col)) return true;
        if(onePath(maze, sol, row, col+1)) return true;
        if(onePath(maze, sol, row-1, col)) return true;
        if(onePath(maze, sol, row, col-1)) return true;

        //backtrack only if all fail
        //unmark after recursion
        sol[row][col] = 0;

        return false;
    }

    public static void print(int arr[][]){
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

        onePath(maze, sol, 0, 0);
    }
}