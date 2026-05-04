public class App {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        //checking row
        for(int i=0; i<9; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }

        //checking col
        for(int j=0; j<9; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        }

        //checking the grid
        int sr = (row/3) * 3;  //starting row
        int sc = (col/3) * 3;  //starting col
        //loop to check all 9 places in the grid
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }


        return true;
    }

    public static boolean sudokusolver(int sudoku[][], int row, int col){
        // --> base case
        if(row == 9 && col == 0){  //when sudoku completes ((9,0) is the first cell after sudoku completes)
            return true;
        }

        // --> recurion
        //calculation of next row and col
        int nextrow = row; 
        int nextcol = col+1;
        //when on last col
        if(nextcol == 9){
            nextrow = row+1;
            nextcol = 0;
        }
        //to check if the current element is 0 or not (if 0 then we can place otherwise not)
        if(sudoku[row][col] != 0){
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col] = digit;
                if(sudokusolver(sudoku, nextrow, nextcol)){  //if solution exists for next level
                    return true;
                }
                sudoku[row][col] = 0;  //when there is not a solution for next level
            }
        }
        
        return false; //if solution does not exists
    }

    public static void print(int sudoku[][]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        int sudoku[][] = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }};
        
        if(sudokusolver(sudoku, 0, 0)){
            System.out.println("Solution exists");
            print(sudoku);
        }else{
            System.out.println("Solution does not exits");
        }
        
    }
}
