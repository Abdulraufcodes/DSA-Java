public class App {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("green");  //cannot be directly set by p1.color='green'
        System.out.println(p1.getColor());  //cannot be directly accessed by p1.color
    }
}

class Pen{
    private String color;

    //getter
    String getColor(){
        return this.color;
    }

    //setter
    void setColor(String newColor){
        this.color = newColor;
    }
}
