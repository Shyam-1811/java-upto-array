import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :   ");
        int a = sc.nextInt();
        System.out.print("Enter the operator : ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the  second number : ");
        int b = sc.nextInt();
        switch (op) {
        case '+' : 
        System.out.print(a+b);
        break;
        case '-' : 
        System.out.print(a+b);
        break;
        case '*' : 
        System.out.print(a+b);
        break;
        case '/' : 
        System.out.print(a+b);
        break;
            default:
                break;
        }
    }
  

   
}
