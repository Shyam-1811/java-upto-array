public class operators {
    public static void main(String[] args) {
        int a = 24;
        int b = 3;
        double d = a/b; 
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(d);
        System.out.println(a%b);
        int c = 3;
         System.out.println(c%c); // a%b = a (a<b)
        System.out.println(c%23); //a%(-b) = a%b
        int s = -55;
        System.out.println(s%10);
        System.out.println(-s%-10);
    }
}
