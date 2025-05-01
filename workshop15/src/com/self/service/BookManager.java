package com.self.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.self.exception.UserException;
import com.self.vo.parent.Book;

public interface BookManager {

	// Book 추가하는 기능.
	void insertBook(Book book) throws UserException;

	// Book 삭제하는 기능.
	void deleteBook(int isbn)throws UserException;

	// Book 장르에 따라 구분하여 업데이트 하는 기능.
	void updateBook(Book book)throws UserException;
	
	// Book 의 고유한 isnb 책번호를 가지고 Book 찾는기능
	Book getBook(int isnb)throws UserException;
	
	// 등록된 모든 Book 을 가져오는 기능
	ArrayList<Book> getAllBook()throws UserException;
	
	// 등록된 Book 개수를 가져오는 기능
	int getNumberOfBooks();
	
	// 등록된 Book 중에 title 이 같은 Book 을 가져오는 기능
	ArrayList<Book> searchBookByTitle(String title)throws UserException;
	
	// 등록된 Book 중에 최소금액과 최대금액사이의 해당하는 Book 을 가져오는 기능
	ArrayList<Book> searchBookByPrice(int min, int max)throws UserException;
	
	// 등록된 모든 Book 의 가격을 더한 금액을 가져오는 기능
	double getSumPriceOfBooks();
	
	// 등록된 모든 Book 의 가격의 평균값을 가져오는 기능
	double getAvgPriceOfBooks();
	
	// 등록된 모든 Book 중에 소설에 해당하고 찾고자하는 genre 의 Book 을 가져오는 기능
	ArrayList<Book> groupBook(String genre)throws UserException;
	
	// 등록된 모든 Book 중에 잡지에 해당하고 찾고자하는 월의 Book 을 가져오는 기능
	ArrayList<Book> monthlyBook(int month)throws UserException;
}
