public class solveSudoku{
    //2
    public boolean isSafe(char[][] board, int row, int col, int number){
        //row & col
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char) (number +'0')){
                return false;
            }
            if(board[row][i] == (char) (number +'0')){
                return false;
            }
        }
        //for grid
        int sr = (row/3) * 3;//this will give starting row in the grid
        int sc = (col/3) * 3;//this will give starting col in the grid

        for(int i=sr; i<sr+3; i++){ //this is to traverse in all cells of a grid
            for (int j=sc; j<sc+3; j++){
                if(board[i][j] == (char) (number)+'0'){
                    return false;
                }
            }
        }
        return true;
    }
    //1
    public boolean helper(char[][] board, int row, int col) { //this is our recursive function
        if(row == board.length){ //base case, as we are traversing row wise and rows are finished
            return true;
        }

        int nrow = 0;//new row
        int ncol = 0;//new col

        if(col != board.length-1){//when we have to taverse over a row
        nrow = row;
        ncol = col+1;
     }else{                       //when we have to change row as we are on the last cell of row
        nrow = row+1;
        ncol = 0;
      }

      if(board[row][col] != '.'){
        if(helper(board, nrow, ncol)){ //this is when we get the soln, so we are returning true
            return true;
        }
      }else{
        for(int i=1; i<=9; i++){ //this is to place numbers in the cell
            if(isSafe(board ,row, col, i)){
                board[row][col] = (char)(i+'0');//i is integer in loop so to make it char we use this method and add a character 0 to it
                if (helper(board, nrow, ncol)){
                    return true;
                }else{
                    board[row][col] = '.'; //if the previous placed number where not correct this will make them null
                }
            }
        }
      }
      return false;//when no solution is correct 
    }
    //start
    public void solveSudoku(char[][] board){ //this is 2D array of board with char as all are represented by either number or '.'
        helper(board, 0, 0);
    }
}