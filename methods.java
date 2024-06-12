import java.util.Scanner;
class square{
    int res;
    void add(int x){
        res = x*x;
        System.out.println(res);
    }
}
public class methods {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
    int n = sc.nextInt();
    square calc = new square();
    calc.add(n);

    }
   

}
