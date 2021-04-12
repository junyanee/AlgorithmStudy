import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		// InsertionSort O(N^2) 삽입정렬 
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("생성하고자 하는 배열의 수를 입력하세요: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("배열에 넣을 수를 입력하세요: ");
		for (int a = 0; a < arr.length; a++) {
			arr[a] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < arr.length-1; i++) {
			int j = i;
			while(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				j--;
			}
			
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

}
