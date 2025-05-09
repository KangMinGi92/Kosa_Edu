package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		double d = 0;
		switch (str) {
		case "A+":
			d = 4.3;
			break;
		case "A0":
			d = 4.0;
			break;
		case "A-":
			d = 3.7;
			break;
		case "B+":
			d = 3.3;
			break;
		case "B0":
			d = 3.0;
			break;
		case "B-":
			d = 2.7;
			break;
		case "C+":
			d = 2.3;
			break;
		case "C0":
			d = 2.0;
			break;
		case "C-":
			d = 1.7;
			break;
		case "D+":
			d = 1.3;
			break;
		case "D0":
			d = 1.0;
			break;
		case "D-":
			d = 0.7;
			break;
		default:
			d = 0.0;
		}
		bw.write(String.valueOf(d));
		bw.flush();
		bw.close();
	}// main
}// class

/*
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 * 
 * A+: 4.3, A0: 4.0, A-: 3.7
 * 
 * B+: 3.3, B0: 3.0, B-: 2.7
 * 
 * C+: 2.3, C0: 2.0, C-: 1.7
 * 
 * D+: 1.3, D0: 1.0, D-: 0.7
 * 
 * F: 0.0
 * 
 * 입력 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 * 
 * 출력 첫째 줄에 C언어 평점을 출력한다.
 * 
 */
// throws IOException 던져야 사용가능하다.
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
