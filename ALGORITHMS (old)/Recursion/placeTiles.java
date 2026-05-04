public class placeTiles{
    public static int placeTiles(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertiPlacement = placeTiles(n-m,m);
        //horizontally
        int horiPlacement = placeTiles(n-1,m);
        return vertiPlacement + horiPlacement;
    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(placeTiles(n,m));
    }
}