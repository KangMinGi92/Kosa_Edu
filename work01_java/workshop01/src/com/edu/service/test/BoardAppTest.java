package com.edu.service.test;

import java.util.Date;

import com.edu.service.Board;
import com.edu.service.Writer;

public class BoardAppTest {

	public static void main(String[] args) {
		Writer writer=new Writer();
		Board board=new Board();
		writer.setWriterInfo("James","jj");
//		board.setWriter(writer);
		board.write("주식폭등","관세정책 유보로 인한 결과입니다.", new Date(2025,04,10),writer);
//		System.out.println(board.getBoard()+","+board.getWriter().getWriterInfo());
		System.out.println("게시글 정보를 조회합니다.");
		System.out.println(board.getBoard());
		System.out.println(board.getBoard());
		System.out.println(board.getBoard());
	}

}
