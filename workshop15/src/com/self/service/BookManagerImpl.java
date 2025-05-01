package com.self.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.self.exception.UserException;
import com.self.vo.child.Magazine;
import com.self.vo.child.Novel;
import com.self.vo.parent.Book;

public class BookManagerImpl implements BookManager {
	private Map<Integer, Book> books;

	private static final BookManagerImpl bookManagerImpl = new BookManagerImpl();

	private BookManagerImpl() {
		books = new HashMap<Integer, Book>();
	}

	public static final BookManagerImpl getInstance() {
		return bookManagerImpl;
	}

	@Override
	public void insertBook(Book book) throws UserException {
//		books.add(book);
		if (books.containsKey(book.getIsbn()))
			throw new UserException("이미 등록되있는 책입니다.");
		else
			books.put(book.getIsbn(), book);
		System.out.println(book.getTitle() + " 이 등록 되었습니다.");
	}

	@Override
	public void deleteBook(int isbn) throws UserException {
		if (books.containsKey(isbn)) {
			Book deleteBook = books.remove(isbn);
			System.out.println(deleteBook.getTitle() + " 이 삭제 되었습니다.");
		} else {
			throw new UserException("삭제하고자하는 책이 존재하지 않습니다.");
		}
	}

	@Override
	public void updateBook(Book book) throws UserException {
		if (books.containsKey(book.getIsbn())) {
			books.replace(book.getIsbn(), book);
			System.out.println(book.getTitle() + "의 정보가 업데이트 되었습니다.");
		} else {
			throw new UserException("업데이트하고자하는 책을 찾지 못했습니다.");
		}
	}

	@Override
	public Book getBook(int isnb) throws UserException {
		if (books.containsKey(isnb))
			return books.get(isnb);
		else
			throw new UserException(isnb + "에 해당하는 책을 찾지 못했습니다.");
	}

	@Override
	public ArrayList<Book> getAllBook() throws UserException {
		ArrayList<Book> find = new ArrayList<>();
		if (books.isEmpty()) {
			throw new UserException("등록된 책이 없습니다.");
		} else {
			Set<Integer> set = books.keySet();
			for(Integer i : set) {
				find.add(books.get(i));
			}
		}
		return find;
	}

	@Override
	public int getNumberOfBooks() {
		return books.size();
	}

	@Override
	public ArrayList<Book> searchBookByTitle(String title) throws UserException {
		ArrayList<Book> find = new ArrayList<>();
		Set<Integer> set = books.keySet();
		for (Integer i : set) {
			if (books.get(i).getTitle().equals(title)) {
				find.add(books.get(i));
			}
		}
		if (find.isEmpty())
			throw new UserException(title + "에 해당하는 책이 없습니다.");
		return find;
	}

	//
	@Override
	public ArrayList<Book> searchBookByPrice(int min, int max) throws UserException {
		ArrayList<Book> find = new ArrayList<>();
		Set<Integer> set = books.keySet();
		for (Integer i : set) {
			if ((int) books.get(i).getPrice() >= min && (int) books.get(i).getPrice() <= max) {
				find.add(books.get(i));
			}
		}
		if (find.isEmpty())
			throw new UserException(min + "~" + max + " 가격에 해당하는 책이 없습니다.");
		return find;
	}

	@Override
	public double getSumPriceOfBooks() {
		double sum = 0;
		for (Book b : books.values()) {
			sum += b.getPrice();
		}
		return sum;
	}

	@Override
	public double getAvgPriceOfBooks() {
		return books.isEmpty() ? -1 : getSumPriceOfBooks() / getNumberOfBooks();
	}

	@Override
	public ArrayList<Book> groupBook(String genre) throws UserException {
		ArrayList<Book> find = new ArrayList<>();
		Set<Integer> set = books.keySet();
		for (Integer i : set) {
			if (books.get(i) instanceof Novel && ((Novel) books.get(i)).getGenre().equals(genre)) {
				find.add(books.get(i));
			}
		}
		if (find.isEmpty())
			throw new UserException(genre + " 에 해당하는 책이 없습니다.");
		return find;
	}

	@Override
	public ArrayList<Book> monthlyBook(int month) throws UserException {
		ArrayList<Book> find = new ArrayList<>();
		Set<Integer> set = books.keySet();
		if (month > 0 && month < 13) {
			for (Integer i : set) {
				if (books.get(i) instanceof Magazine && ((Magazine) books.get(i)).getMonth() == month)
					find.add(books.get(i));
			}
		} else {
				throw new UserException(month + "월은 존재 하지 않습니다.");
		}
		return find;
	}
}
