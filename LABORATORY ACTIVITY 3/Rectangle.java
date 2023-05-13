import java.util.Scanner;

public class Rectangle implements Shape {

    @Override
    public void triangle() {
        
    }

    @Override
    public void rectangle() {
        Scanner input = new Scanner(System.in);
        System.out.println("Length: ");
        int l = input.nextInt();
        System.out.println("width: ");
        int w = input.nextInt();
        int area = l*w;
        System.out.println("The area of a rectangle is " + area );

    }

    @Override
    public void circle() {
        
    }

    @Override
    public void trapeziod() {
        
    }
    
}
