import java.util.Scanner;

public class Activity4 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        // Input grades in each subject
        System.out.print("Enter Grade in Physics: ");
        int physicsGrade = sc.nextInt();

        System.out.print("Enter Grade in Algebra: ");
        int algebraGrade = sc.nextInt();

        System.out.print("Enter Grade in Programming: ");
        int programmingGrade = sc.nextInt();

        int sum = physicsGrade + algebraGrade + programmingGrade;
        int totalSubjects = 3;
        int averageGrade = sum / totalSubjects;
        System.out.println(name + " " + "average grade is " + averageGrade);


        int gpa = sum/totalSubjects;
        if ((gpa>= 95) && (gpa <= 100)) {

            System.out.println("President Lister");

        } else if ((averageGrade>= 89) && (averageGrade<= 94)) {
            System.out.println("Dean Lister");

        } else if ((gpa>= 83) && (gpa<= 88)) {
            System.out.println("Average Student");

        } else if ((averageGrade>= 78) && (averageGrade<= 82)) {

            System.out.println("Fair");

        } else if (averageGrade < 78) {

            System.out.println("Failure");

        } else {
            System.out.println("Invalid grade");

        }

    }
}
