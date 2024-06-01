import java.util.Scanner;

public class char2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++)
            {
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }
}
}
// git remote add origin https://github.com/Shyam-1811/vh.git
// git branch -M main
// git push -u origin main