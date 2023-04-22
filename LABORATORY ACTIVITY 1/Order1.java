
import java.util.Scanner;


public class Order1 extends FoodMenu{
    //OverRide
    void MainMenu(){
       Scanner input = new Scanner(System.in);
       System.out.print("Order 1: ");
       String Order1 = input.nextLine();
       System.out.println("Order 1 : " + Order1);
   } 
}
