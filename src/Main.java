import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();

        Cupcake cupcake = new Cupcake();

        RedVelvet redVelvet = new RedVelvet();

        Chocolate chocolate = new Chocolate();
        
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");
        Scanner input = new Scanner(System.in);
        System.out.println("\nWe are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();
    }
}
class Cupcake{
    public double price;

    public double getPrice;

    public void setPrice(double price){
        this.price = price;
    }

    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}
class RedVelvet extends Cupcake {
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }

}
class Chocolate extends Cupcake {
    public void type (){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
    
}
