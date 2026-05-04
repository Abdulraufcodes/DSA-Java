public class App {
    public static void numtoword(String arr[], int idx, String str, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        String currnum = arr[str.charAt(idx)-'0'];
        numtoword(arr, idx+1, str, newstr+currnum+" ");
    }
    public static void main(String[] args) throws Exception {
        String arr[] = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight","nine"};
        String str = "1997";
        numtoword(arr, 0, str, "");
    }
}
