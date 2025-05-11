package codus.week02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortNum3_10989 {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        //List<Integer> list = new ArrayList<>();
        for(int i=0; i<num; i++){
            //list.add(Integer.parseInt(br.readLine()));
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int n : arr) {
            bw.write(n + "\n");
        }
        bw.close();
    }
}
