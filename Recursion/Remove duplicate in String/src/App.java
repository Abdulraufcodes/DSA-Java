public class App {
    public static void removedup(String str, StringBuilder newstr, int idx, boolean map[]){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char currchar = str.charAt(idx);
        //if index not true
        if(map[currchar-'a'] == true){
            removedup(str, newstr, idx+1, map);
        }
        //if index is true
        else{
            map[currchar-'a'] = true;
            removedup(str, newstr.append(currchar), idx+1, map);
        }
    }
    public static void main(String[] args) throws Exception {
        String str = "appnnacollege";
        removedup(str, new StringBuilder(""), 0, new boolean[26]);
    }
}
