import java.util.Scanner;

public class Activity6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String name = sc.nextLine();

        System.out.print("Enter number of times: ");
        int number = sc.nextInt();


        for (int ctr = 1; ctr < number; ctr++) {
            System.out.println(name);
        }

        int num = number;

        // condition
        if (num > 1) {
            System.out.println("Good job.");

        } else { //block of code to be executed if the condition is false
            System.out.println("Invalid input, program ends");

        }
    }
}
