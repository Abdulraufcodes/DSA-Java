//Problem: counting the number of ways to go from the top-left corner (0,0) to the bottom-right corner (n-1, m-1) in a grid, moving only down or right.

public class App {
    public static int gridWays(int i, int j, int n, int m){
        if(i == n-1 && j == m-1){   //condition when we reach the last cell 
            return 1;               //If you're already at the last cell → only 1 way (stay there)
        }else if(i == n || j == m){  //condition when boundary is crossed so return 0 as there is not path from there
            return 0;
        }
        int w1 = gridWays(i+1, j, n, m);  //move down
                                          // or
        int w2 = gridWays(i, j+1, n, m);  //move right
        return w1 + w2;
    }
    public static void main(String[] args) throws Exception {
        int n=3, m=3;
        System.out.println(gridWays(0, 0, n, m));
        
    }
}
