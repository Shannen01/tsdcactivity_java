import java.util.Scanner;
public class Activity1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // This program will print your name

        String firstName;
        String middleInitial;
        String lastName;


        System.out.print("Enter Your  First Name: ");
        firstName = sc.nextLine();

        System.out.print("Enter Your  Middle Initial: ");
        middleInitial = sc.nextLine();

        System.out.print("Enter Your  Last Name: ");
        lastName = sc.nextLine();


        System.out.println("Your name is " + firstName + " " + middleInitial + " " + lastName + ".");

    }
}
