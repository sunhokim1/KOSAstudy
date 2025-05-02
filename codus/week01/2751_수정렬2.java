package codus.week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class NumberSort{

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arr[] = new int[Integer.parseInt(br.readLine())];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]).append("\n");
        }

        bw.write(sb+"\n");
        bw.flush();
        bw.close();
    }
}