public class App {
    public static int addone(int n){
        return -(~n);
    }
    public static void main(String[] args) throws Exception {
        System.out.println(addone(4));
    }
}
