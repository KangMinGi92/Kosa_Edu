package com.edu.repactoring.test;

import java.util.Scanner;

import com.edu.repactoring.Player;
/**
 * {@code
 * 가위 바위 보 게임을 진행하는 코드
 * 5판 3선승제
 * 3판 2선승제
 * 1판 1승 규칙으로 진행됩니다.
 * }
 * @author 우진, 유나, 민기, 승환
 * @version project 01
 * @since JDK17
 * 
 * */
public class GameTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/**
		 * Player는 게임 진행 관련된 객체이다.
		 */
		Player player = new Player();
		
		/**
		 * <pre>
		 * 초기 변수들 초기화
		 * playerInput 플레이어의 입력한 값(가위, 바위, 보)
		 * totalGame 게임의 총 판 수
		 * count 진행 된 게임 판 수
		 * </pre>
		 */
		String playerInput = "";
		int totalGame = 0;
		int count = 0;

		System.out.println("가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요.");

		/**
		 * <pre>
		 * 플레이어가 고른 규칙을 선택하는 로직
		 * 
		 * games 플레이어가 원한 규칙
		 * 1. 5판 3승
		 * 2. 3판 2승
		 * 3. 1판 1승
		 * 
		 * 1~3 값이 아닌 다른값을 입력 할 시 다시 입력하도록 예외처리
		 * </pre>
		 */
		int games = sc.nextInt();
		while (!(games >= 1 && games <= 3)) {
			System.out.println("(1~3) 값으로 다시 입력해 주세요.");
			games = sc.nextInt();
			sc.nextLine();
		}
		
		switch (games) {
		case 1:
			totalGame = 5;
			break;
		case 2:
			totalGame = 3;
			break;
		case 3:
			totalGame = 1;
		}

		/**
		 * <pre>
		 * Player 객체에 있는 setTotalGame 메소드 호출
		 * </pre>
		 */
		player.setTotalGame(totalGame);

		/**
		 * <pre>
		 * 플레이어가 선택한 판 수를 기준으로 게임 시작
		 * 판을 진행 할 수록 count 값을 증가시킨다.
		 * 플레이어 에게 값을 입력 받는다 (가위, 바위, 보)
		 * 가위, 바위, 보 가 아닌 다른 값을 입력시 예외 처리
		 * </pre>
		 */
		while (count < totalGame) {
			++count;
			System.out.print("가위바위보 중 하나 입력: ");
			playerInput = sc.nextLine();

			if (playerInput.equals("가위") || playerInput.equals("바위") || playerInput.equals("보")) {
				player.GamePlaying(playerInput);
			} else {
				System.out.println("가위 바위 보 중 입력해주세요");
			}
		}
		
		/**
		 * <pre>
		 * 게임 결과를 최종적으로 출력
		 * </pre>
		 */
		player.Winner(count, totalGame);
		
		sc.close();
	}

}
