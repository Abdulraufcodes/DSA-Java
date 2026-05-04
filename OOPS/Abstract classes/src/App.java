public class App {
    public static void main(String[] args) throws Exception {
        // Horse h1 = new Horse();
        // h1.eats();
        // h1.walks();

        // Chicken c1 = new Chicken();
        // c1.eats();
        // c1.walks();

        //object of animal cannot be created
        // Animal A1 = new Animal();

        // System.out.println(h1.color); //will be brown unless changed
        // h1.changeColor(); //color change

        Mustang m1 = new Mustang();  //Animal -> Horse -> Mustang
        
    }
}

//IMP: abstract class do not have objects
abstract class Animal{
    String color;

    //constructor of abstract class - called when object of sub class is created
    Animal(){
        System.out.println("Animal constructor called ");
        color = "brown";
    }

    void eats(){
        System.out.println("can eat");
    }

    //sub-classes must have implemented abstract method
    //abstract class gives just idea and subclass have to figure out how to walk
    abstract void walks(); //abstract methods do not have implementation(body) 
}

//sub-class
class Horse extends Animal{

    Horse(){
        System.out.println("Horse constructor called ");
    }

    void changeColor(){
        color = "dark brown";
    }
    void walks(){
        System.out.println("walks on 4 legs");
    }
}

//sub-class
class Chicken extends Animal{
    void walks(){
        System.out.println("walks on 2 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called ");
    }
}
