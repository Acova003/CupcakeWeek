import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cakeMenu, ArrayList<Drink>drinkMenu){
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");

        ArrayList<Object> order = new ArrayList<Object>();

        Scanner input = new Scanner(System.in);

        String placeOrder = input.nextLine();

        if (placeOrder.equalsIgnoreCase("Y")) {
            
        } else {
            System.out.println("Have a nice day then");
        }


    }
}
