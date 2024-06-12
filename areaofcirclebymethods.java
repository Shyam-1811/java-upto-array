import java.util.Scanner;
class Area{
    int res;
    int circle(int x,int y){
  res = y*x*x;
  return res;
    }
    }
public class areaofcirclebymethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n : ");
   Area calc = new Area();
   int n = sc.nextInt();
   double b  = 3;
   int area = calc.circle(n,b);
   System.out.println(area);
    }
}
