import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 수 정렬하기3

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        
        int counting[] = new int[10001];
        int result[] = new int [n];
        
        for (int i = 0; i < n; i++) {
            counting[arr[i]] ++;
        }
        
        for (int i = 2; i < 10001; i++) {
            counting[i] += counting[i-1];
        }
        
        for (int i = n-1; i >= 0; i--) {
            result[--counting[arr[i]]] = arr[i];
        }
        
        for (int num : result) {
            sb.append(num).append('\n');
        }
        
        System.out.print(sb);
    }
}