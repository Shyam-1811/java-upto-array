import java.util.Scanner;

public class c2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if (n%5 == 0 && n != 0) {
           System.out.println("Number is divisible by 5."); 
        }
        else{
            System.out.println("number is not divisible by 5.");
        }
    }
}
