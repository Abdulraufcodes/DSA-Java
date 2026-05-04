public class towerOfHenoi{
    public static void towerOfHenoi(int n, String src, String helper, String dest){
        if(n == 1){
            System.out.println(" transfer disk"+n+" from "+src+" to "+dest);
            return;
        }
        //transfer top n-1 disk from src to helper using dest as helper
        towerOfHenoi(n-1, src, dest, helper);

        //transfer nth disk from src to dest
        System.out.println("transfer "+n+" from "+src+" to "+dest);

        //transfer n-1 disk form helper to dest using src as helper
        towerOfHenoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n=3;
        towerOfHenoi(n, "S", "H", "D");
    }
    
}
 