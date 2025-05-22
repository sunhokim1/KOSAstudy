import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Main_11004{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer set = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(set.nextToken());
        int K = Integer.parseInt(set.nextToken());

        StringTokenizer val = new StringTokenizer(bf.readLine());    

        PriorityQueue que = new PriorityQueue<>();

        for(int i = 0; N > i; i++){
            que.add(Integer.parseInt(val.nextToken()));
        }

        for(int i =0; K - 1 > i; i++){
            que.poll();
        }
        System.out.println(que.poll());
        bf.close();
    }
}

