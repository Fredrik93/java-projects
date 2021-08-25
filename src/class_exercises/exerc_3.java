package class_exercises;

import java.util.*;

public class exerc_3 {
    public static void main(String[] args) {
        double price;
        double discountPercentage;
        String productName;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the products name : ");
        productName = scan.nextLine();
        System.out.println("Enter the price : ");
        price = scan.nextDouble();
        System.out.println("Enter the discount :");
        discountPercentage = scan.nextDouble();
        double discount = discountPercentage * 0.01;
        double deductedSum = price * discount;
        double result = price - deductedSum;
        System.out.println(productName + " costs " + result + " with a " + discountPercentage + " % discount");
    }
}
