import java.util.Scanner;

public class profitloss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the costprice:");
    int cp = sc.nextInt();
    System.out.println("Enter the sellingprice:");
    int sp = sc.nextInt();
    if (sp>cp) {
        int profit = sp-cp;
        System.out.println("profit"+profit);
    }
    else{
        int loss = cp-sp;
        System.out.println("loss"+loss);
    }
  }
  
}