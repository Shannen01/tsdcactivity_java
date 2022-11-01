import java.util.Arrays;
import java.util.Scanner;

public class Activity7 {
    public static void main(String[]args){
        int length = 5;
        String[] athletes = new String[length];
         int[] sales =   new int[length];
        Scanner sc = new Scanner (System.in);

        for ( int i = 0; i < length; i++) {

            System.out.print("Enter athlete " + (i + 1) + " : ");
            athletes[i] = sc.nextLine();
            System.out.print("Enter sales: ");
            sales[i] = Integer.parseInt(sc.nextLine());
            System.out.println();
        }
        System.out.println("Name     Sales");

        for( int i = 0; i < length; i++){
            System.out.println(athletes[i] +"   $" + sales[i]);
            System.out.println();

        }



        int total = Arrays.stream(sales).sum();
        System.out.println("Total:$" + total );

    }
}

