package yjungs2.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// BOJ 11399 ATM
class BOJ11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
		int ans = 0;
		String[] str = br.readLine().split(" "); // 한 줄 입력 String 배열로 받기
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(str[i]); // String 배열 -> int 배열로 변경
		Arrays.sort(arr); // 오름차순 정렬
		for(int i=0; i<n; i++)
			ans += arr[i]*(n-i);
		System.out.println(ans);
    }
}