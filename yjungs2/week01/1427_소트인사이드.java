package yjungs2.week01;

import java.util.Arrays;
import java.util.Scanner;

//BOJ 1427 소트인사이드
class BOJ1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int[] arr = new int[str.length()];
		for(int i=0; i<str.length(); i++) {
			arr[i] = Integer.parseInt(str.substring(i, i+1));
		}
		Arrays.sort(arr);
		for(int i=arr.length-1; i>=0; i--)
			System.out.print(arr[i]);
	}
}