import java.util.Scanner;
public class simpleinterestfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle : ");
        int p = sc.nextInt();
        System.out.print("Enter the rate : ");
        double r = sc.nextDouble();
        System.out.print("Enter the time : ");
        double t = sc.nextDouble();
        double simpleinterest = (p*r*t)/100;
        System.out.print("The simpleinterset is : ");
        System.out.print(simpleinterest);
    }
}
