import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// BubbleSort 버블정렬 O(n^2)

		Scanner sc = new Scanner(System.in);
		System.out.printf("생성하고자 하는 배열의 수를 입력하세요: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("배열에 넣을 수를 입력하세요: ");
		for (int a = 0; a < arr.length; a++) {
			arr[a] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1 - i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for (int k = 0; k < arr.length; k++) {
		System.out.println(arr[k]);
		}
	}

}
