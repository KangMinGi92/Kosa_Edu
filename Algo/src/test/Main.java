package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		Random r = new Random();
		for(int i=0;i<n;i++) {
			list.add(r.nextInt(10000)+1);
		}
		for(Integer i : list) {
			if(i<x) {
				result.add(i);
			}
		}
		
		for(Integer s : result) {
			System.out.println(s);
		}
	}// main
}// class		

			//throws IOException 던져야 사용가능하다.
//        // 빠른 입력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        // 빠른 출력
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int T = Integer.parseInt(br.readLine());
//
//        for (int i = 0; i < T; i++) {
//            String[] parts = br.readLine().split(" ");
//            int A = Integer.parseInt(parts[0]);
//            int B = Integer.parseInt(parts[1]);
//            bw.write((A + B) + "\n");
//        }
//
//        // 출력 버퍼 비우기
//        bw.flush();
//        bw.close();
//        br.close();


