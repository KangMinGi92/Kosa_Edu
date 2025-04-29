package com.edu.repactoring;

public class Player {

	/**
	 * 총 게임의 판수
	 */
	private int totalGame = 0;
	/**
	 * 플레이어의 이긴 횟수
	 */
	private int result_win = 0;
	/**
	 * 플레이어의 진 횟수
	 */
	private int result_lose = 0;

	/**
	 * @param totalGame 총 게임의 판 수
	 */
	public void setTotalGame(int totalGame) {
		this.totalGame = totalGame;
	}
	/**
	 * @param inputPlayer 플레이어가 입력한 값 (가위, 바위, 보)
	 * <pre>
	 * 게임을 진행 중 5판 3선 중 3판을 먼저 이겼을때
	 * 게임을 진행 중 3판 2선 중 2판을 먼저 이겼을때
	 * 조기 종료를 위한 코드
	 * </pre>
	 */
	public void GamePlaying(String inputPlayer) {
		
		GameRSP(inputPlayer);

		if (result_win >= (totalGame / 2 + 1)) {
			System.out.println("\n### 인간 승");
			System.exit(0);
		} else if (result_lose >= (totalGame / 2 + 1)) {
			System.out.println("\n### 컴퓨터 승");
			System.exit(0);
		}

	}
	/**
	 * @param count 게임 진행 한 판의 수
	 * @param totalGame 게임 전체 판의 수
	 * <pre>
	 * 최종적으로 플레이어의 승리/패 를
	 * 비교해주는 코드
	 * </pre>
	 */
	public void Winner(int count, int totalGame) {

		if (count == totalGame) {
			if (result_win > result_lose) {
				System.out.println("\n### 인간 승");
			} else if (result_win == result_lose) {
				System.out.println("\n### 비김");
			} else {
				System.out.println("\n### 컴퓨터 승");
			}
		}
	}
	/**
	 * 
	 * @param inputPlayer 플레이어가 입력한 값(가위, 바위, 보)
	 * <pre>
	 * 플레이어가 입력한 값(가위, 바위, 보) 과 컴퓨터가 랜덤으로 낸 값(가위-1, 바위-2, 보-3)
	 * 을 비교하여 플레이어의 승/패 를 비교해주는 로직
	 * </pre>
	 */
	public void GameRSP(String inputPlayer) {
		
		int com = (int) ((Math.random() * 3) + 1);

		switch (inputPlayer) {
		case "가위":
			if (com == 1) {
				System.out.println("비겼습니다!!!");
			} else if (com == 2) {
				System.out.println("졌습니다!!!");
				result_lose += 1;
			} else {
				System.out.println("이겼습니다!!!");
				result_win += 1;
			}
			break;
		case "바위":
			if (com == 2) {
				System.out.println("비겼습니다!!!");
			} else if (com == 3) {
				System.out.println("졌습니다!!!");
				result_lose += 1;
			} else {
				System.out.println("이겼습니다!!!");
				result_win += 1;
			}
			break;
		case "보":
			if (com == 3) {
				System.out.println("비겼습니다!!!");
			} else if (com == 1) {
				System.out.println("졌습니다!!!");
				result_lose += 1;
			} else {
				System.out.println("이겼습니다!!!");
				result_win += 1;
			}
			break;
		}
	}
}
