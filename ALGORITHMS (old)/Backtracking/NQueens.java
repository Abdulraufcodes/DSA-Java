class NQueens{
    //3
    public Boolean isSafe(int row, int col, char[][] board){//this will check in all direction if there is another queen or not
        //horizontal
        for (int j=0; j<board.length; j++){
            if (board[row][j] == 'Q'){
                return false;
            }
        }
        //vertical
        for(int i=0; i<board.length; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //upper left
        int r = row;
        for(int c=col; c>=0 && r>=0; r--,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //upper right
         r=row;
        for (int c=col; c<board.length && r>=0; r--,c++){
            if(board[r][c] = 'Q'){
                return false;
            }
        }
        //lower left
        r=row;
        for (int c=col; c>=0 && r<board.length; r++,c--){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        //lower right
        for (int c=col; c<board.length && r<board.length; r++,c++){
            if(board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
    //4
    public void saveboard(char[][] board,  List<List<String>> allBoards){
        String row = "";
        List<String> newBoard = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board[0].length ; j++){
                if(board[i][j] == 'Q')
                row += 'Q';
                else
                row += '.';
            }
            newBoard.add(row);
        }

        allBoards.add(newBoard);
    }
    //2
    public void helper(char[][] board,  List<List<String>> allBoards, int col){//this is recursive function in which we are going to backtrack
        if(col == board.length) { //base condition;if all cols are over this will execute
            saveboard(board,allBoards);
            return;
        }
        for(int row=0; row<board.length; row++){
            if(isSafe(row, col, board)){
                board[row][col] = 'Q';
                helper(board, allBoards, col+1);
                board[row][col] = '.';//this is to delete queen from its place
            }
        }
    }
    //1
    public List<List<Strings>> solveNQueens(int n){
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
    }
   
} 