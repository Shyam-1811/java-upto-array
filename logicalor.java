import java.util.Scanner;

public class logicalor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number: ");
        int number = sc.nextInt();
        if (number % 5 == 0 || number% 3 == 0) {
            System.out.println("Number is divisible by 5 or 3. ");}

            else{
                System.out.println("Number is not divisible by 5 or 3");
            
        }
    }
   
}