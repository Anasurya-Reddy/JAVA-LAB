/*Identify the Maximum and Minimum values in an array*/
import java.util.Scanner;
class MaxMin {
	static void Max(int a[]) {
		int max=a[0];
		for(int i=1;i<a.length;i++)
			if (max<a[i])
				max = a[i] ;
		System.out.println("Maximum value in the array is " + max);
	}
	
	static void Min(int a[]) {
		int min=a[0];
		for(int i=1;i<a.length;i++)
			if (min>a[i])
				min = a[i] ;
		System.out.println("Minimum value in the array is " + min);
	}
}

public class arraymaxmin {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 elements into array:");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		MaxMin.Max(a);
		MaxMin.Min(a);
	}
}
