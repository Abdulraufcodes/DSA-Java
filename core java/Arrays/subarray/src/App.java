// Online Java Compiler
// Use this editor to write, compile and run your Java code online

public class App {
    public static void printsubarray(int marks[]){
        for(int i=0; i<marks.length; i++){
            int start = i;
            for(int j=i; j<marks.length; j++){
                int end = j;
                int total = 0;
                for(int k=start; k<=end; k++){
                    total += marks[k];
                    System.out.print(marks[k]+" ");
                }
                System.out.print("="+total);
                System.out.println();
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10,12};
        
        printsubarray(marks);
    }
}