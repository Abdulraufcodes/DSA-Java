public class optimized {

    static int N = 8;

    // Check if the move is valid
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N &&
                y >= 0 && y < N &&
                sol[x][y] == -1);
    }

    // Print the solution board
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    // Main function to solve Knight Tour
    public static boolean solveKT() {
        int sol[][] = new int[N][N];

        // Initialize all cells as unvisited
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // Possible moves for a knight
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2,  2,  1, -1, -2, -2, -1 };

        // Starting position
        sol[0][0] = 0;

        // Start recursion
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
        }

        return true;
    }

    // Recursive utility function
    public static boolean solveKTUtil(int x, int y, int movei,
                                      int sol[][],
                                      int xMove[], int yMove[]) {

        // Base case: all cells are visited
        if (movei == N * N) {
            return true;
        }

        // Try all 8 possible moves
        for (int k = 0; k < 8; k++) {
            int next_x = x + xMove[k];
            int next_y = y + yMove[k];

            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;

                if (solveKTUtil(next_x, next_y, movei + 1,
                                sol, xMove, yMove)) {
                    return true;
                } else {
                    // Backtracking
                    sol[next_x][next_y] = -1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        solveKT();
    }
}