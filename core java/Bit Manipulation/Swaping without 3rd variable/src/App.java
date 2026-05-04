public class App {
    public static void main(String[] args) throws Exception {
        int x = 5, y = 3;

        //swaping
        x = x ^ y; //storing x^y to x
        y = x ^ y; // basically (x^y)^y = x  from above as x=x^y
        x = x ^ y; // basically (x^y)^x    from above as x=x^y and x=y

        System.out.println("after swap x: "+x+" and y: "+y);
    }
}
