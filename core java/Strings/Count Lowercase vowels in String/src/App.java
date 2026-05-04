import java.util.*;



public class App {
    public static int countvowels(String str){
    int count = 0;
    for(int i=0; i<str.length(); i++){
        char ch = str.charAt(i);
        if(Character.isLowerCase(ch) && (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')){
            count++;
        }
    }
    return count;
}
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countvowels(str));
    }
}
