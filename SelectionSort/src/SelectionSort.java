import java.util.Scanner;

// Selection Sort (선택정렬)

public class SelectionSort {

	public static void main(String[] args) {
		
		int i, j, min, index=0, temp, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("생성하고자 하는 배열의 수를 입력하세요: ");
		num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("배열에 넣을 수를 입력하세요: ");
		for (int a = 0; a < num; a++) {
			arr[a] = sc.nextInt();
		}
		
		for (i = 0; i < num; i++) {
			// 최소값은 입력받은 수보다 더 크게 세팅
			min = num+1;
			for (j = i; j < num; j++) {
				if (min > arr[j]) {
					// 최소값 변경, 최소값이 있는 인덱스 저장
					min = arr[j];
					index = j;
				}
			}
			// 가장 앞 인덱스와 최소값이 있는 인덱스 스왑
			temp = arr[i];
			arr[i] = arr[index];
			arr[index] = temp;
		}
		for (int k = 0; k < num; k++) {
			System.out.println(arr[k]);
		}
		
	}

}
