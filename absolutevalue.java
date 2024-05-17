import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        double n = sc.nextDouble();
        if (n<0) {
            System.out.println("absolute value is");
            System.out.print(-n);
        }
        else{
            System.out.println("absoute value is "+n);
        }
    }
}
