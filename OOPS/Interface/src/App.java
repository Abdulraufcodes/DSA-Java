public class App {
    public static void main(String[] args) throws Exception {
        //example of interface
        // Queen q1 = new Queen();
        // q1.moves();

        //example of multiple inheritance using interface
        Bear b1 = new Bear();
        b1.eatPlants();
        b1.eatMeat();
    }
}

interface Chessplayer{
    void moves();  //by default abstract so no implementation
}

class Queen implements Chessplayer{
    public void moves(){  //public because method is by default public in interface and we are implementing it from there
        System.out.println("all directions and diagonal");
    }
}

class Rook implements Chessplayer{
    public void moves(){
        System.out.println("all four direction");
    }
}

//example of multiple inheritance

interface Herbivour{
    void eatPlants();
}

interface Carnivour{
    void eatMeat();
}

class Bear implements Herbivour, Carnivour{
    public void eatPlants(){
        System.out.println("eats berry");
    }
    public void eatMeat(){
        System.out.println("eats salmon");
    }
}
