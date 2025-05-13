package codus.week02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class SpecialPrime_2023 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int sum = 0;
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        sb.append(sum/N).append("\n");
        
        sb.append(arr[N/2]).append("\n");

        int fre = 1;
        int max = 1;
        int answer = 0;
        for(int i=N-1; i>1; i--){
            if(arr[i-1] == arr[i]){
                fre++;
                if(max < fre){
                    max= fre;
                    answer = arr[i];
                }
            }else{
                fre = 1;
            }
        }
        sb.append(max).append("\n");
        sb.append(arr[N-1] - arr[0]).append("\n");

        bw.write(sb+"\n");
        bw.close();

    }
}