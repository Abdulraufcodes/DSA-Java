//or placing n queens in n rows
//problem: placing 1 queen in a row and then in next row (finding all permutaions)

public class App {
    public static void nQueens(char board[][],int row){
        //base case
        if(row == board.length){
            print(board);
            return;
        }
        //column loop
        for(int j=0; j<board.length; j++){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = 'X';  //removing queen for next permutation
        }
    }
    public static void print(char board[][]){
        System.out.println("--------Chess board---------");  //statement to seperate chess boards
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        int n = 2;
        char board[][] = new char[n][n];

        //initializing array
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 'X';
            }
        }

        nQueens(board,0);
    }
}
