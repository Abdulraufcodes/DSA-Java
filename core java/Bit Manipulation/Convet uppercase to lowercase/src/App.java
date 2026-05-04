public class App {
    public static void main(String[] args) throws Exception {
        for(char ch='A'; ch<'Z'; ch++){
            System.out.println((char) (ch | ' '));
        }
    }
}

