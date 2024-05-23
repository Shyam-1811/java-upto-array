import java.util.Scanner;

public class logicaland {
 public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print(" Enter the number : ");
      int num = sc.nextInt();
      if (num > 99 && num < 1000) {
        System.out.println(" It is a three digit number.");
      }
      else{
        System.out.println("not a three digit number.");
      }
 }   
}
