public class App {
    public static void main(String[] args) throws Exception {
        String str = "noon";

        for(int i=0; i<str.length()/2; i++){
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i)){  //condition to check first and last and so on
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
