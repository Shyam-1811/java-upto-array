import java.util.Scanner;

public class ternary {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println(" Enter the number : "); 
        int number = sc.nextInt();
        System.out.println((number % 2 == 0) ? "even" : "odd");
}
}
