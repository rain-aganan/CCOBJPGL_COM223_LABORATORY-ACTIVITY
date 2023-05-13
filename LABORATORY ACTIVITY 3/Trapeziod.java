import java.util.Scanner;

public class Trapeziod implements Shape {

    @Override
    public void triangle() {
    
    }

    @Override
    public void rectangle() {
        
    }

    @Override
    public void circle() {
        
    }

    @Override
    public void trapeziod() {
        Scanner input = new Scanner(System.in);
        System.out.println("Base 1: ");
        int b1 = input.nextInt();
        System.out.println("Base 2: ");
        int b2 = input.nextInt();
        System.out.println("Height: ");
        int h = input.nextInt();
        double area = (b1+b2)*h/2;
        System.out.println("The area of a trapeziod is " + area );
    }
    
}
