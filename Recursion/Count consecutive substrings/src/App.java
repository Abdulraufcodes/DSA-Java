public class App {
    public static int countsub(String str, int start, int end, int counter){
        if(start == str.length()){
            return counter;
        }
        
        if(end < str.length()){
         return countsub(str,start,end+1,counter+1);
        }
        
       
            
            return countsub(str, start+1, start+1, counter);
        
        
        
    }
    public static void main(String[] args) throws Exception {
        String str = "abc";
        System.out.print(countsub(str, 0,0,0));
    }
}


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void main(String[] args) {
        
        
    }
}
