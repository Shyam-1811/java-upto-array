import java.util.Scanner;
public class typecasting {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer : ");
        int a = sc.nextInt();
        double b = (double)a;
        System.out.print("Afer typecasting :");
        System.out.println(b/2);

       }
    
}
