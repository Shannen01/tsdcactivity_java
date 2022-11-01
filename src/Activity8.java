import java.util.Scanner;

public class Activity8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RectangleMethod rm = new RectangleMethod();

       double length;
       double width;

        System.out.print("Enter length: ");
        length = Double.parseDouble(sc.nextLine());

        System.out.print("Enter width: ");
        width = Double.parseDouble(sc.nextLine());

        double perimeter = rm.calculatePerimeter(length,width);
        double area = rm.calculateArea(length, width);

        System.out.println("Perimeter is " + perimeter + " meters");
        System.out.println("Area is " + area + " meters");


    }
}