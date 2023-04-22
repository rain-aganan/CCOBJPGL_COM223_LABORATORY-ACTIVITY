
import java.util.Scanner;


public class Order2 extends FoodMenu {
    //OverRide
    void MainMenu(){
       Scanner input = new Scanner(System.in);
       System.out.print("Order 2: ");
       String Order2 = input.nextLine(); 
       System.out.println("Order 2 : " + Order2);
       System.out.print("Amount of Serving: ");
       String AS2 = input.nextLine();
       System.out.println("Amount of Serving: " + AS2);
   } 
}
