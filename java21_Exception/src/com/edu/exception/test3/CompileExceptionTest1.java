package com.edu.exception.test3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
	프로그램을 수행하는도중에 발생하는 예기치못하는 사건이나 상황!!
	일종의 버그 혹은 에러
	
	예외처리의 상당부분이 강력한 제어문으로 사용
	특정한 조건일때 고의적으로 에러를 발생시켜서 프로그램을 제어하는 수단...
	사용자정의 예외처리!!
*/
class FileService {
	public void readFile(String fileName) {
		System.out.println("2. FileReader Creating....");
		//fileName 파일을 읽어들이는 로직을 작성
		//Stream에 대한 이해가 필요
		
		//					 Stream(데이터흐름)
		//Source(데이터 근원) ------------------>  Sink(데이터 종착지)
		//   Keyboard								Console
		
		try {
			FileReader fr = new FileReader(fileName); // new 객체생성 x, Stream의 자원을 열어서사용
			System.out.println("3. 파일을 성공적으로 찾았습니다"); 
			fr.read();
		}catch(FileNotFoundException e) {// File 못찾았을때 경우 1. file명이 잘못, 2. 경로가 잘못
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class CompileExceptionTest1 {

	public static void main(String[] args) {
		System.out.println("1. readFile() calling....");
		FileService service = new FileService();
		service.readFile("texst.txt");
	}

}
