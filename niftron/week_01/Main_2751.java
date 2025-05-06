
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.io.IOException;

class Main_2751{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(bf.readLine());
        int[] array = new int[len];

        for(int i=0; len > i; i++){
            array[i] = Integer.parseInt(bf.readLine());
        }

        Arrays.sort(array);

        for(int a : array){
            bw.write(a + "\n");
        }

        bw.flush();
    }
}