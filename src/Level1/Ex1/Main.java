package Level1.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("Milk", 1.99);
        Product p2 = new Product("Bread", 0.76);
        Product p3 = new Product("Onion", 0.25);

        Product [] products = {p1,p2,p3};

        Sale s = new Sale();
        Sale s1 = new Sale(List.of(p1,p2,p3));

        System.out.println(s);
        System.out.println(s1);

        try{
            s.calculateTotalPrice();
        } catch (EmptySellException e) {
            System.err.println("EmptySellException catched: " + e.getMessage());
        }

        try {
            s1.calculateTotalPrice();
        } catch (EmptySellException e) {
            System.err.println("EmptySellException catched: " + e.getMessage());
        }

        System.out.println("s.TotalPrice = " + s.getTotalPrice());
        System.out.println("s1.TotalPrice = " + s1.getTotalPrice());

        // forcing IndexOutOfBounds exception
        try{
            Product p4 = products[4]; // products.size = 3;
        }catch (IndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }
    }
}
