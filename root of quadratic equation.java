import java.util.Scanner;
public class roots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coeficents of Quadratic Equation:");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         int d = (b*b)-(4*a*c);
         if (d>0) {
            System.out.println("Roots are real and distint");
            System.out.println("Root 1:" + (-b+Math.sqrt(d))/2*a + " and " + "Root 2:" + (-b-Math.sqrt(d))/2*a);
         }
         else if (d==0) {
            System.out.println("Roots are real and equal");
            System.out.println("Roots are:" + -b/2*a);
         }
         else{
         	System.out.println("Roots are imaginary and complex");
         }
    }
}
