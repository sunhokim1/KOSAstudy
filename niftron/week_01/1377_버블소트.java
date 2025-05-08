package niftron.week_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


    public class test3 {
        public static void main(String[] args) throws NumberFormatException, IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(bf.readLine());
            mData[] A = new mData[n];
            for(int i =0; n > i; i++){
                A[i] = new mData(Integer.parseInt(bf.readLine()), i);
            }

            Arrays.sort(A);
            int Max =0;

            for(int i = 0; n > i; i++){
                if(Max < A[i].index - i){
                    Max = A[i].index - i;
                }

                
            }

            System.out.println(Max + 1);
            
        }



    }
    class mData implements Comparable<mData>{
        int value;
        int index;

        public mData(int value, int index){
            this.value = value;
            this.index = index;
        }
        @Override
        public int compareTo(mData o) {
           return this.value - o.value;
        }
       
    }
