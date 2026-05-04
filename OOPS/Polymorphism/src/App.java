public class App {
    public static void main(String[] args) throws Exception {
        //method overloading
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(1, 2));
        System.out.println(c1.sum((float)1.5,(float)2.5));
        System.out.println(c1.sum(1,2,3));

        //method overriding 
        Deer d1 = new Deer();
        d1.eats();
    }
}

//eg. of method overriding
class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}

class Deer extends Animal{
    void eats(){
        System.out.println("eats grass");
    }
}


//eg. of Method overloading
class Calculator{
    int sum(int a, int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}