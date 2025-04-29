import java.util.Scanner;

public class SawonMBTITest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("K전자 신입사원수 입력 >>> ");
		int num = sc.nextInt();// 배열의 사이즈
		int[] people = new int[num]; // 6

		System.out.println("공백을 기준으로 각 사원에 대한 성격 유형을 직접 입력 >>> ");

		// 코드 작성
		for (int i = 0; i < people.length; i++) {
			people[i] = sc.nextInt();
		}
		int answer = 0;
		int max = 0;
		int[] counts = new int[num];
		for (int i : people) {
			counts[i]++;
			if (max < counts[i]) {
				max = counts[i];
				answer = i;

			}
		}

		System.out.println("정답 :: " + answer);
	}
}
