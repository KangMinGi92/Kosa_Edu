package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            int a=Integer.parseInt(br.readLine());
            String[] arr = br.readLine().split(" ");
            List<Integer> list =new ArrayList<>();
            for(int i=0;i<a;i++){
                list.add(Integer.valueOf(arr[i]));
            }
            int max= Collections.max(list);
            int min= Collections.min(list);
            bw.write(min+" "+max);
            bw.flush();
            bw.close();
        }
    }// main
}// class
















