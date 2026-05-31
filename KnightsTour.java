

public class KnightsTour {

    static int N = 8;

    // Check if x,y are valid indexes for N*N chessboard
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Print solution matrix
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    // Solve Knight Tour problem
    public static boolean solveKT() {

        int sol[][] = new int[N][N];

        // Initialize solution matrix
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // Knight's possible moves
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // Knight starts from (0,0)
        sol[0][0] = 0;

        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol);
        }

        return true;
    }

    // Recursive utility method
    public static boolean solveKTUtil(int x, int y, int movei,
                                      int sol[][], int xMove[], int yMove[]) {

        int k, nextX, nextY;

        // Base case
        if (movei == N * N) {
            return true;
        }

        // Try all next moves
        for (k = 0; k < 8; k++) {
            nextX = x + xMove[k];
            nextY = y + yMove[k];

            if (isSafe(nextX, nextY, sol)) {
                sol[nextX][nextY] = movei;

                if (solveKTUtil(nextX, nextY, movei + 1, sol, xMove, yMove)) {
                    return true;
                } else {
                    // Backtracking
                    sol[nextX][nextY] = -1;
                }
            }
        }

        return false;
    }

    public static void main(String args[]) {
        solveKT();
    }
}