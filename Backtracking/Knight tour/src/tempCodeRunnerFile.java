public class App {
    public static boolean isSafe(int board[][], int row, int col) {
        int n = board.length;
        if (row < 0 || row >= n || col < 0 || col >= n || board[row][col] != -1) {
            return false;
        }

        return true;

    }

    public static boolean helper(int board[][], int seq, int row, int col) {
        int n = board.length;

        // 1. check safe FIRST
        if (!isSafe(board, row, col)) {
            return false;
        }

        // 2. place move
        board[row][col] = seq;

        // 3. base case (after placing)
        if (seq == n * n - 1) { // as number of cells are n*n-1
            return true;
        }

        
        if (helper(board, seq + 1, row - 2, col - 1)) {
            return true;
        }
        if (helper(board, seq + 1, row - 2, col + 1)) {
            return true;
        }
        if (helper(board, seq + 1, row - 1, col + 2)) {
            return true;
        }
        if (helper(board, seq + 1, row + 1, col + 2)) {
            return true;
        }
        if (helper(board, seq + 1, row + 2, col - 1)) {
            return true;
        }
        if (helper(board, seq + 1, row + 2, col + 1)) {
            return true;
        }
        if (helper(board, seq + 1, row + 1, col - 2)) {
            return true;
        }
        if (helper(board, seq + 1, row - 1, col - 2)) {
            return true;
        }

        //backtrack if false
        board[row][col] = -1;
        
        return false;
    }

    public static void knighttour(int n) {
        int board[][] = new int[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = -1;
            }
        }
        helper(board, 0, 0, 0);
        print(board);
    }

    
    public static void print(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        int n = 5;
        knighttour(n);
    }
}
