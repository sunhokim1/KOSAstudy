package codus.week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class SortInSide{
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

            String numberString = br.readLine();
           
            char [] numbers = numberString.toCharArray();
            Arrays.sort(numbers);
            StringBuilder sb = new StringBuilder();

            for(int i=numbers.length-1; i>=0; i--){
                sb.append(numbers[i]-'0');
            }

        bw.write(sb+"\n");
        bw.flush();
        bw.close();
    }

}