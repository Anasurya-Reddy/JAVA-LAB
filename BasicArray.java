//Basic Array Declareton And Initialization
public class arraydeclare {
	public static void main(String[] args) {
		int numbers[] = new int[5] ;
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;
		}
		for (int i:numbers) {
			System.out.print(i + " ");
		}
	}
}
