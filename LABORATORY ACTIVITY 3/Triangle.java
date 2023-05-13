import java.util.Scanner;

public class Triangle implements Shape {

    @Override
    public void triangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Base: ");
        int b = input.nextInt();
        System.out.println("Height: ");
        int h = input.nextInt();
        double area = b*h*0.5;
        System.out.println("The area of a triangle is " + area );

    }

    @Override
    public void rectangle() {
        
    }

    @Override
    public void circle() {
        
    }

    @Override
    public void trapeziod() {
        
    }
    
}
