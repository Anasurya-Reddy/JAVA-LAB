/*Calculate the Sum and Average of elements in an array*/
import java.util.Scanner;
public class arraysumavg {
	public static void main(String[] args) {
		int a[] = new int[10];
		int i,sum=0;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements into array:");
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Sum of array elements=");
		for(i=0;i<a.length;i++) {
			sum += a[i];
		}
		System.out.println(sum);
		avg = (double)sum/10;
		System.out.println("Average of array elements=" + avg);
	}
}
