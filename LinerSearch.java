package linear_search;
import java.util.Scanner;

public class LinerSearch {

	public static void main(String[] args) {
		
		int temp=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int j=0; j<n; j++) {
			arr[j] = sc.nextInt();
		}
		System.out.println("Enter the item.");
		int item = sc.nextInt();
		sc.close();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == item) {
				System.out.println("item is present "+ i + " index position");
				temp=1;
				break;
			}
		}
		if(temp == 0) {
			System.out.println("Item is not found");
		}

	}
}
