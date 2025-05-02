package com.edu.exception.test3;
/*
	프로그램을 수행하는도중에 발생하는 예기치못하는 사건이나 상황!!
	일종의 버그 혹은 에러
	
	예외처리의 상당부분이 강력한 제어문으로 사용
	특정한 조건일때 고의적으로 에러를 발생시켜서 프로그램을 제어하는 수단...
	사용자정의 예외처리!!
*/
class FileService {
	public void readFile(String fileName) {
		//fileName 파일을 읽어들이는 로직을 작성
		//Stream에 대한 이해가 필요
	}
}
public class CompileExceptionTest1 {

	public static void main(String[] args) {
		FileService service = new FileService();
		service.readFile("test.txt");
	}

}
