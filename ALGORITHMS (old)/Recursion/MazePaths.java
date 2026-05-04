public class MazePaths{
    public static int printPath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 || j== m-1){
            return 1;
        }
        //move downwards
        int downpaths = printPath( i+1, j,n,m);
        //move right
        int rightpaths = printPath(i, j+1, n, m);

        return downpaths + rightpaths;
    }
    public static void main(String args[]){
        int n=3,m=3;
        int totalpaths = printPath(0,0,n,m);
        System.out.println(totalpaths);
    }
}