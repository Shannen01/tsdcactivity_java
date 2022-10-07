import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter product: ");
        String product = sc.nextLine();

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        int number = 100;

        if ((price>= 0)&&(price <= 10000)) {
            // discount of the product is 0%
           double  discount = 0; // 0 means 0%
           double discountPrice = (price * discount) / 100;
           double netPrice = price - discountPrice;
           System.out.println("Price of " + product + " " + "is: " + price );
           System.out.println("Discount is: " + discountPrice );
           System.out.println("Net price is: " + netPrice );

        } else if ((price >= 10001)&&(price <= 20000)) {
            // discount of the product is 5%
            double discount = 5; // 5 means 5%
            double discountPrice = (price * discount) / 100;
            double netPrice = price - discountPrice;

            System.out.println("Price of " + product + " " + "is: " + price );
            System.out.println("Discount is: " + discountPrice );
            System.out.println("Net price is: " + netPrice );

        } else if ((price >= 20001)&&(price <= 50000)) {
            // discount of the product is 10%
            double discount = 10; // 10 means 10%
            double discountPrice = (price * discount) / 100;
            double netPrice = price - discountPrice;

            System.out.println("Price of " + product + " " + "is: " + price );
            System.out.println("Discount is: " + discountPrice );
            System.out.println("Net price is: " + netPrice );

        } else if ((price >= 50001)&&(price <= 100000)) {
            // discount of the product is 15%
            double discount = 15; // 15 means 15%
            double discountPrice = (price * discount) / 100;
            double netPrice = price - discountPrice;

            System.out.println("Price of " + product + " " + "is: " + price );
            System.out.println("Discount is: " + discountPrice );
            System.out.println("Net price is: " + netPrice );

        } else if (price >100000){
            // discount of the product is 20%
            double discount = 20;// 20 means 20%
            double discountPrice = (price * discount) / 100;
            double netPrice = price - discountPrice;

            System.out.println("Price of " + product + " " + "is: " + price );
            System.out.println("Discount is: " + discountPrice );
            System.out.println("Net price is: " + netPrice );

        } else {

            System.out.println("invalid code!");
        }

        System.out.println("Thank you for checking price discount!");
    }
}
