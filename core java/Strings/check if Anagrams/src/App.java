import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String str1 = "listen";
        String str2 = "silent";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()){

            char[] str1charray = str1.toCharArray();
            char[] str2charray = str2.toCharArray();

            Arrays.sort(str1charray);
            Arrays.sort(str2charray);

            boolean result = Arrays.equals(str1charray, str2charray);

            if(result){
                System.out.println("Anagrams");
            }else{
                System.out.println("not Anagrams");
            }

        }
        else{
            System.out.println("not anagrams");
        }
    }
}
