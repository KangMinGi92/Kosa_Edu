package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		System.out.println((int)c);
	}// main
}// class	

/*
알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

입력
알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

출력
입력으로 주어진 글자의 아스키 코드 값을 출력한다.

*/
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


