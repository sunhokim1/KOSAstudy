package sunho.Week04.numK;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class NumK {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		int k = Integer.parseInt(br.readLine());
		int left = 1;
        int right = k;
        int answer = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 0;

            for (int i = 1; i <= n; i++) {
                count += Math.min(mid / i, n);
            }

            if (count < k) {
                left = mid + 1;
            } else {
                answer = mid;
                right = mid - 1;
            }
        }

		bw.write(answer + "\n");
		bw.flush();
		bw.close();
	}

}
