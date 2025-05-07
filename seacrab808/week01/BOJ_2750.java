<<<<<<< HEAD
import java.io.*;

public class BOJ_2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLint());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
	}
}

public class BOJ_2750 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		for (int val : arr) {
			System.out.println(val);
		}
	}
=======
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2750 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());
    int arr[] = new int[N];

    for(int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    for(int i = 0; i < N - 1; i++) {
      for(int j = 0; j < N - 1 - i; j++) {
        if(arr[j] > arr[j + 1]) {
          int tmp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = tmp;
        }
      }
    }

    for(int val : arr) {
      System.out.println(val);
    }
  }
>>>>>>> aaf27c8 ([BOJ 2750] 수 정렬하기1)
}