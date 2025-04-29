package com.edu.service;

import java.util.Date;
//게시글 관련된 정보를 저장하는 클래스...
//어떤 사람이 작성한 게시글인지를 포함...
//Board <---- Writer :: Has a Relation
public class Board {
	public String title;
	public String content;
	public Date date;
	public int count;
	Writer writer;
	
//	setBorad보단 write라는 명명법이 더 직관적으로 알기 쉽다.
//	public void setBorad
	public void write(String title,String content,Date date,Writer writer) {
		this.title=title;
		this.content=content;
		this.date=date;
		this.writer=writer;
	}
	public String getBoard() {
		updateCount();
		return title+","+content+","+date+ ",조회수 = "+count+","+writer.getWriterName();
	}
	//setWriter 기능은 중복기능이라 write에 writer를 넣어서 주석처리한다.
//	public void setWriter(Writer writer) {
//		this.writer=writer;
//	}
//	public Writer getWriter() {
//		return writer;
//	}
	//작성한 게시글을 조회하는 기능과 유사....
	//이때 count가 1씩 증가...
//	public void updateCount()
//	public은 모든 클래스에서 호출하여 사용할 수 있다.
//  private 는 같은 클래스 안에서만 호출하여 사용할 수 있다.
	
	private void updateCount() {
		count +=1;
		//count = count+1; 위에 연산과 같은 기능
	}
}
