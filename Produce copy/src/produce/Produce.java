
package produce;

import java.util.ArrayList;
import java.util.Scanner;

public class Produce {
    private String productName;
    private double cost;
    public String getProductName() {
        return productName; }
    public void setProductName(String productName) {
        this.productName = productName; }
    public void setItemCost(double itemCost) {
        this.cost = itemCost; }
    public String toString() {
        return productName + ", " + cost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String product;
        int howMany;
        double costPerPd, weight, cost, price, total=0, amtTendered=0, change=0;
        boolean done = false;
        String response;

        ArrayList<Produce> produce = new ArrayList<Produce>();
      

        while (!done) {
            System.out.println("Produce name: ");
            product = in.nextLine();
            System.out.println("Is this priced per pound? (y/n)");
            response = in.next();
            if(response.equalsIgnoreCase("y"))
            {
                System.out.println("Enter price: ");
                costPerPd = in.nextDouble();
                System.out.println("Enter weight: ");
                weight = in.nextDouble();
                cost = weight * costPerPd;
                howMany = 0;
            }
            else
            {
                System.out.println("Enter price per item: ");
                price = in.nextDouble();
                System.out.println("Enter quantity: ");
                howMany = in.nextInt();
                cost = howMany * price;
                costPerPd = 0;
                weight = 0;
                
            }
            
            Produce p = new Produce();
            p.setItemCost(cost);
            p.setProductName(product);
            produce.add(p);
            in.nextLine();
            System.out.println("Want to enter another item? (y/n) ");
            
            if (in.nextLine().equalsIgnoreCase("n")) {
                done = true;
            }
        }
        System.out.println(produce);
        for(Produce p: produce) {
           total += p.cost;            
        }
        System.out.println("You owe: $"+total);
        System.out.println("Enter amount tendered: ");
        amtTendered = in.nextDouble();
        change = amtTendered - total;
        System.out.println("Change: " + change);
        
    }
    
}
