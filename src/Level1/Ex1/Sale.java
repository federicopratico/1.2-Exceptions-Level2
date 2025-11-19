package Level1.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> prodcutList;
    private double totalPrice;

    public Sale() {
        this.prodcutList = new ArrayList<>();
    }

    public Sale(List<Product> prodcutList) {
        this.prodcutList = new ArrayList<>(prodcutList);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice() throws EmptySellException {
        if(prodcutList.isEmpty()) throw new EmptySellException("To make a sale you must first add products.");

        for(Product p : prodcutList) {
            this.totalPrice += p.getPrice();
            System.out.println(totalPrice);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Product p : prodcutList) {
            sb.append(p.getName()).append("\t").append(p.getPrice()).append("\n");
        }
        return sb.toString();
    }
}
