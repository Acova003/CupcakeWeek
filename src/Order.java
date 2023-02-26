import java.lang.reflect.Constructor;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public Order(ArrayList<Cupcake> cupcakeMenu, ArrayList<Drink>drinkMenu){
        System.out.println("Hello customer. Would you like to place an order? (Y or N)");


        Scanner input = new Scanner(System.in);

        String placeOrder = input.nextLine();

        ArrayList<Object> order = new ArrayList<Object>();

        if (placeOrder.equalsIgnoreCase("Y")) {
            order.add(LocalDate.now());
            order.add(LocalTime.now());
            System.out.println("Here is the menu.");
            System.out.println("CUPCAKES:");
            int itemNumber = 0;

            for (int index = 0; index < cupcakeMenu.size(); index++) {
                itemNumber ++;
                System.out.println(itemNumber);
                cupcakeMenu.get(index).type();
                System.out.println("Price: " + cupcakeMenu.get(index).getPrice());
            }
        } else {
            System.out.println("Have a nice day then");
        }


    }
}
