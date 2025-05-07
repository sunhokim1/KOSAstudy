
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main_1427{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String num = bf.readLine();

        char[] B = num.toCharArray();
        Arrays.sort(B);
        
        for(int i = B.length - 1; i >=0; i--){
            System.out.print(B[i]);
        }
        bf.close();
    }
}

