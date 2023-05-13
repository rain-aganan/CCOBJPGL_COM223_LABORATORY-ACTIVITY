import java.util.Scanner;

public class Circle implements Shape {

    @Override
    public void triangle() {
        
    }

    @Override
    public void rectangle() {
        
    }

    @Override
    public void circle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Radius: ");
        int r = input.nextInt();
        double area = r*r*3.14;
        System.out.println("The area of a circle is " + area );
    }

    @Override
    public void trapeziod() {
        
    }
    
}
