package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("0")) {
                flag = false;
            } else {
                Integer[] iarr = new Integer[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    iarr[i] = Integer.valueOf(arr[i]);
                }
				Arrays.sort(iarr);
                boolean con = test(iarr[0], iarr[1], iarr[2]);
                if (con) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }// main

    private static boolean test(int a, int b, int c) {
        boolean flag = (a * a) + (b * b) == (c * c);
        return flag;
    }
}// class

/*
 * 과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다. 주어진 세변의 길이로 삼각형이 직각인지 아닌지
 * 구분하시오.
 * 
 * 입력 입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다. 각 테스트케이스는 모두 30,000보다 작은 양의 정수로
 * 주어지며, 각 입력은 변의 길이를 의미한다.
 * 
 * 출력 각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.
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
