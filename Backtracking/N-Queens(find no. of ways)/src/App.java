//or placing n queens in n rows
//problem: placing 1 queen in a row and then in next row (finding all permutaions)

public class App {

    //these conditions are very imp see what(rows and cols) changes from where
    public static boolean isSafe(char board[][], int row, int col) {
        // verical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // if no queen found in above conditions
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) {
            // print(board);
            count++;
            return;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = 'X'; // removing queen for next permutation
            }
        }
    }

    public static void print(char board[][]) {
        System.out.println("--------Chess board---------"); // statement to seperate chess boards
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    //optimization
    static int count = 0; //static varible

    public static void main(String[] args) throws Exception {
        int n = 4;
        char board[][] = new char[n][n];

        // initializing array
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'X';
            }
        }

        nQueens(board, 0);
        System.out.println("number of ways to place n queens = "+count);
    }
}
