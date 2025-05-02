package com.edu.exception.test3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 	FileReader는 파일을 읽어들이는 일종의 Stream이다.
 	Stream을 생성한다는 것은 객체를 생성한다는 것이 아니라
 	자원을 열어서 사용하겠다는 의미이다.
 	이때 사용을 한 후에는 반드시 닫아줘야지만
 	자원이 누수되는 현상을 막을수 있다.
 	
 	~Service 클래스는 기능 중심의 클래스이다.
 	기능에 대한 코드 가독력을 높여야 좋은 코드가 만들어진다.
 	이때 예외처리로 인한 블락들은 코드 가독력을 저해하는 치명적인 요인이다.
 	그래서 메소드 구현부에는 반드시 예외를 직접 잡지 않고 반드시 던져야 한다.
 */
class FileService2 {
	public void readFile(String fileName) {
		System.out.println("2. FileReader Creating....");
		FileReader fr=null; // 변수 scope 때문에 밖에 선언해둬야한다.
		try {
			fr = new FileReader(fileName);
			System.out.println("3. 파일을 성공적으로 찾았습니다"); 
			fr.read();
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}finally {
			//finally에서 해줘야 무조건 자원을 닫을수 있다.
			//finally 블럭 안에서 또 다른 예외가 발생하면 해당 블럭은 수행안됨.
			try {
			if(fr!=null)
				fr.close();
			}catch(IOException e) {
				 System.out.println(e.getMessage());
			}
		}
	}
}
public class CompileExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("1. readFile() calling....");
		FileService2 service = new FileService2();
		service.readFile("tezxt.txt");
	}

}
