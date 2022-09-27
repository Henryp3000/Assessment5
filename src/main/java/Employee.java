import Assessment.Customer;

import java.util.Scanner;



/* All employees get a 10% discount off a clothing Item




 */

public class Employee extends Customer {


        Double Price = null;
        DiscountPrice = 10.0;
        Double totalCost, costToPaid, discount;
        Scanner scan = new Scanner( System.in);
        System.out.print("Total Shopping amount: ");
        totalCost = Price * discountPrice * Price;
    int employee ;

    private double DiscountPrice;


    public double getDiscountPrice() {
        return DiscountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        DiscountPrice = discountPrice;
    }

    public Employee(double discountPrice) {
        DiscountPrice = discountPrice;
        System.out.println();


    }
}

