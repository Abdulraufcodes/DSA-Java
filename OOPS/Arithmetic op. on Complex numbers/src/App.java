import java.util.*;

class Complex{
        int real;
        int img;

        public Complex(int r, int i){
            real = r;
            img = i;
        }

        public static Complex add(Complex a, Complex b){
            return new Complex((a.real+b.real),(a.img+b.img));
        }

        public static Complex subtract(Complex a, Complex b){
            return new Complex((a.real-b.real), (a.img-b.img));
        }

        public static Complex multiply(Complex a, Complex b){
            return new Complex(((a.real*b.real)-(a.img*b.img)),((a.real*b.img)+(a.img*b.real)));
        }

        public void printComplex(){
            if(real==0 && img!=0){
                System.out.println(img+"i");
            }else if(real!=0  && img==0){
                System.out.println(real);
            }
            else{
                System.out.println(real+"+"+img+"i");
            }
        }
    }



public class App {
    public static void main(String[] args) throws Exception {
        Complex c1 = new Complex(3, 5);
        Complex c2 = new Complex(4 , 2);

        Complex c3 =  Complex.add(c1, c2);
        c3.printComplex(); 
    }
}
