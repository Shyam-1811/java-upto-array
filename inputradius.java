import java.util.Scanner;
public class inputradius {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the radius : ");
    int r = sc.nextInt();
    double pie = 3.1415;
    double area = pie*r*r;
    System.out.println(area);
   }
    
}
