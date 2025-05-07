
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main_11399{
    public static void main(String[] args)  throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int len = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int[] array = new int[len]; 

        for(int i=0; len > i; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int sum = 0;
        int acc = 0;
        for(int i=0; len > i; i++){
            acc += array[i];
            sum += acc;
        }
        System.out.println(sum);
        bf.close();
    }
}
