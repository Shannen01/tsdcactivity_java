import java. util.Scanner;
    public class Activity2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            // This program will calculate your Average Grade

            int mathGrade;
            int englishGrade;
            int filipinoGrade;


            System.out.println("Enter Grade in Math");
            mathGrade = sc.nextInt();

            System.out.println("Enter Grade in English");
            englishGrade = sc.nextInt();

            System.out.println("Enter Grade in Filipino");
            filipinoGrade = sc.nextInt();

            int sum = mathGrade + englishGrade + filipinoGrade;
            int totalSubjects = 3;
            int averageGrade = sum / totalSubjects;

            System.out.println("Average Grade is " + averageGrade);
        }
    }
