import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Shape rec = new Rectangle();
        Shape tri = new Triangle();
        Shape cir = new Circle();
        Shape tra = new Trapeziod();

        Scanner input = new Scanner(System.in);
        System.out.println("Input Shape Number : ");
        System.out.println(" [1] = Rectangle ");
        System.out.println(" [2] = Triangle ");
        System.out.println(" [3] = Circle ");
        System.out.println(" [4] = Trapeziod ");
        int shape = input.nextInt();
        
        switch (shape){
            case 1:
                rec.rectangle();
            break;
            case 2:
                tri.triangle();
            break;
            case 3:
                cir.circle();
            break;
            case 4:
                tra.trapeziod();
            break;
        }
        
    }
}

