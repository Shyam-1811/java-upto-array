import java.util.Scanner;

public class Grades {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(" Enter the marks : "); 
        int marks = sc.nextInt();
        if (marks <= 100 && marks >= 81) {
            System.out.print("very good");
        }
        else if (marks <= 80 && marks >= 61) {
            System.out.print(" good");
        }
         else if (marks <= 60 && marks >= 41) {
            System.out.print("average");
        }
        else {
            System.out.print("fail");
        }
    }
}


