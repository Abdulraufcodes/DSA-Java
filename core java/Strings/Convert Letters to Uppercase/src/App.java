public class App {

    public static String toUppercase(String str){
        StringBuilder sb = new StringBuilder(""); //making a stringbuilder to append words

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);//append it

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));  //appends white space between words
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        
        return sb.toString();
    }
    public static void main(String[] args) throws Exception {
        String str = "hi, i am rauf";
        System.out.println(toUppercase(str));
    }
}
