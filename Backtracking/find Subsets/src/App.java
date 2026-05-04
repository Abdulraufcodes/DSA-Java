public class App {
    public static void findsub(String str, String ans, int idx){
        if(idx == str.length()){
            System.out.println(ans);
            return;
        }
        findsub(str, ans+str.charAt(idx), idx+1);
        findsub(str, ans, idx+1);
    }
    public static void main(String[] args) throws Exception {
        String str = "abc";
        findsub(str,"",0);
    }
}
