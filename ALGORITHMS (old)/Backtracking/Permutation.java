class Permutation{
    //Time complexity = O(n * n!)
    public static void printPermutation(String str, String perm, int idx){ //String perm is used to store new permutations that we create
        if(str.length() == 0){                                             //and idx for 3 places that need to be filled(for ABC)
            System.out.println(perm);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);//this is to remove the currChar from the newstr.first substring will remove
            printPermutation(newStr, perm + currChar, idx+1);                  // the currChar and other will store rest of the characters of str
        }                                                                    
    }
    public static void main(String args[]){
        String str = "ABC";
        printPermutation(str,"",0);
    }
}

    //This is the process of 'for loop'

/* Let's walk through an example with str = "ABC":

First Call (str = "ABC", perm = "", idx = 0):

Loop iteration i = 0:
currChar = 'A'
newStr = "BC"
Recursive call: printPermutation("BC", "A", 1)
Loop iteration i = 1:
currChar = 'B'
newStr = "AC"
Recursive call: printPermutation("AC", "B", 1)
Loop iteration i = 2:
currChar = 'C'
newStr = "AB"
Recursive call: printPermutation("AB", "C", 1)
Second Call (str = "BC", perm = "A", idx = 1):

Loop iteration i = 0:
currChar = 'B'
newStr = "C"
Recursive call: printPermutation("C", "AB", 2)
Loop iteration i = 1:
currChar = 'C'
newStr = "B"
Recursive call: printPermutation("B", "AC", 2)
Third Call (str = "C", perm = "AB", idx = 2):

Loop iteration i = 0:
currChar = 'C'
newStr = "" (empty string)
Recursive call: printPermutation("", "ABC", 3)
Base Case (str = "", perm = "ABC", idx = 3):

Since str is empty, perm (which is "ABC") is printed.
This process continues for all possible permutations. */