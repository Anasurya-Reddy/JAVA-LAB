import java.util.Scanner;
public class hollowtriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                if(i==n-1 || j==0)
                    System.out.print("* ");
                else if(i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
