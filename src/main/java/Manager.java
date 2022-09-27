import java.util.Scanner;

public class Manager {
/*
Managers get 25% off a clothing Item;
 */


    private double DiscountPrice;


    public Manager(double discountPrice) {
        Double Price = null;
        DiscountPrice = 25.0;
        Double totalCost, costToPaid, discount;
        Scanner scan = new Scanner( System.in);
        System.out.print("Total Shopping amount: ");
        totalCost = Price * discountPrice * Price;



    }

    @Override
    public String toString() {
        return "Manager{" +
                "DiscountPrice=" + DiscountPrice +
                '}';
    }
}
