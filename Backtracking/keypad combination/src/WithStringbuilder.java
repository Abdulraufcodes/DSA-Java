public class WithStringbuilder {

    public static void combination(String keypad[],String digits,int idx, StringBuilder curr){

        //base case
        if(idx == digits.length()){ 
            System.out.println(curr);
            return;
        }

        char digit = digits.charAt(idx); //getting single digit from digits
        int num = digit-'0';  //converting it to int
        String letters = keypad[num]; //getting letters at digit

        //loop for adding all the letters
        for(int i=0; i<letters.length(); i++){
            char ch = letters.charAt(i);
            curr.append(ch);  //adding ch
            combination(keypad, digits, idx+1, curr);  //move to next digit and adding character
            curr.deleteCharAt(curr.length()-1);  //deleting for backtracking as Stringbuilder is mutable and it will change the original curr
        }

    }
    public static void main(String[] args) throws Exception {
        String[] keypad = new String[10];

        keypad[2] = "abc";
        keypad[3] = "def";
        keypad[4] = "ghi";
        keypad[5] = "jkl";
        keypad[6] = "mno";
        keypad[7] = "pqrs";
        keypad[8] = "tuv";
        keypad[9] = "wxyz";

        combination(keypad, "23", 0, new StringBuilder());
    }
}
