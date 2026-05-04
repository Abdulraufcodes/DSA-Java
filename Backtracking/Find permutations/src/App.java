public class App {
    public static void findpermu(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            //logic to delete: "abcde" = "ab" + "de"
            String newstr = str.substring(0, i) + str.substring(i+1); //storing in new string else original string will get altered
            findpermu(newstr, ans+curr);
        }
    }

    public static void main(String[] args) throws Exception {
        String str = "abc";
        findpermu(str, "");
    }
}
