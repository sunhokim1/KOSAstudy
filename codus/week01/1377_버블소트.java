package codus.week01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Point implements Comparable<Point>{
    int num;
    int idx;

    Point(int num, int idx){
        this.num = num;
        this.idx = idx;
    }
    @Override
    public int compareTo(Point o) {
        return num - o.num;
    }
    
}

class BubbleSort{
   
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int N = Integer.parseInt(br.readLine());
        
        Point point[] = new Point[N];

        for(int i=0; i<N; i++){
            point[i] = new Point(Integer.parseInt(br.readLine()), i);
        }
        Arrays.sort(point, 0, N);
        
        int max = 0;
        for(int i=0; i<N; i++){
            max = Math.max(max, point[i].idx-i);
        }
        bw.write(max+1 +"\n");
        bw.flush();
        bw.close();

    }
}