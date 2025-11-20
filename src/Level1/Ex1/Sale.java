package Level1.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private List<Product> productList;
    private double totalPrice;

    public Sale() {
        this.productList = new ArrayList<>();
    }

    public Sale(List<Product> prodcutList) {
        this.productList = new ArrayList<>(prodcutList);
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice() throws EmptySellException {
        if(productList.isEmpty()) throw new EmptySellException("To make a sale you must first add products.");

        for(Product p : productList) {
            this.totalPrice += p.getPrice();
            System.out.println(totalPrice);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Product p : productList) {
            sb.append(p.getName()).append("\t").append(p.getPrice()).append("\n");
        }
        return sb.toString();
    }
}
