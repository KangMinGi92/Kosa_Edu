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
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char[] chars = str.toCharArray();
		for (Character c : chars) {
			if (Character.isUpperCase(c)) {
				sb.append(Character.toLowerCase(c));
			} else {
				sb.append(Character.toUpperCase(c));
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}// main
}// class

/*
 * 영어 소문자와 대문자로 이루어진 단어를 입력받은 뒤, 대문자는 소문자로, 소문자는 대문자로 바꾸어 출력하는 프로그램을 작성하시오.
 * 
 * 입력 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
 * 
 * 출력 첫째 줄에 입력으로 주어진 단어에서 대문자는 소문자로, 소문자는 대문자로 바꾼 단어를 출력한다.
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
