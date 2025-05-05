package yjungs2.week01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//BOJ 11004 K번째 수
class BOJ11004 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] l1 = br.readLine().split(" ");
		int n = Integer.parseInt(l1[0]);
		int k = Integer.parseInt(l1[1]);
		
		String[] l2 = br.readLine().split(" ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = Integer.parseInt(l2[i]);
		
		Arrays.sort(arr);
		System.out.println(arr[k-1]);
	}
}