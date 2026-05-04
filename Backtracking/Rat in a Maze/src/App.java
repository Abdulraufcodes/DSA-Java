public class App {
    public static void findPath(int maze[][], int row, int col){
        
        //condition for out of bound
        if(row >= maze.length || col >= maze[0].length || row <0 || col<0){
            return;
        }
        //condition when path is blocked
        if(maze[row][col] == 0){
            return;
        }
        //base case(when it reaches destination)
        if(row == maze.length-1 && col == maze[0].length-1){
            //mark visited
            maze[row][col] = 0;
            //print
            print(maze);
            //restore visited to origional
            maze[row][col] = 1;
            return;
        }

        //marking the current position as visited
        maze[row][col]= 1;

        //recursion
        findPath(maze, row+1, col);
        findPath(maze, row, col+1);
        findPath(maze, row-1, col);
        findPath(maze, row, col-1);

        //Restore the original value after recursion
        maze[row][col] = 0;

    }

    public static void print(int maze[][]){
        System.out.println("---------maze--------");
        for(int i=0; i<maze.length; i++){
            for(int j=0; j<maze[0].length; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        int maze[][] = { { 1, 1, 1, 1 },
                         { 0, 1, 0, 1 },
                         { 1, 1, 1, 1 },
                         { 1, 0, 1, 1 } };
        
        findPath(maze, 0, 0);
    }
}
