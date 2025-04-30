package com.self.service;

import java.util.ArrayList;
import java.util.List;
import com.self.vo.child.Magazine;
import com.self.vo.child.Novel;
import com.self.vo.parent.Book;

public class BookManagerImpl implements BookManager {
	private List<Book> books = new ArrayList<Book>();

	private static final BookManagerImpl bookManagerImpl = new BookManagerImpl();

	private BookManagerImpl() {
	}

	public static final BookManagerImpl getInstance() {
		return bookManagerImpl;
	}

	@Override
	public void insertBook(Book book) {
		boolean find = false; // 발견하지못함
		for (Book b : books) {
			if (b.getIsbn() == book.getIsbn()) { // 추가하려는 책이 이미 있다면
				find = true; // 찾았다.
				System.out.println("이미 등록되어진 책입니다.");
				return;
			}
			if (find == false) {
				books.add(book);
				System.out.println(book.getTitle() + " 책 등록 성공");
			}
		}
	}

	@Override
	public void deleteBook(int isbn) {
		boolean find = false;
		for (Book b : books)
			if (b.getIsbn() == isbn) {
				System.out.println(b.getTitle() + " 책 삭제 완료되었습니다.");
				find = books.remove(b);
				return;
			}

		if (find == false)
			System.out.println("삭제하려는 책은 현재 등록된 책이 아닙니다.");

	}

	@Override
	public void updateBook(Book book) {
		for (Book b : books) {
			int target = -1;
			if (book.getIsbn() == b.getIsbn()) {
				target = books.indexOf(b);
				System.out.println(target);
				if (target == -1) {
					System.out.println("수정할 타겟을 찾지 못했습니다.");
				} else {
					books.set(books.indexOf(b), book);
					System.out.println("수정 완료 했습니다.");
					return;
				}
			}
		}
	}

	@Override
	public Book getBook(int isnb) {
		Book find = null;
		for (Book b : books)
			if (b.getIsbn() == isnb)
				find = b;
		return find;
	}

	@Override
	public List<Book> getAllBook() {

		return books;
	}

	@Override
	public int getNumberOfBooks() {
		return books.size();
	}

	@Override
	public List<Book> searchBookByTitle(String title) {
		List<Book> find = new ArrayList<Book>();
		for (Book b : books) {
			if (b == null)
				break;
			if (b.getTitle().equals(title))
				find.add(b);
		}
		return find;
	}

	@Override
	public List<Book> searchBookByPrice(int min, int max) {
		List<Book> find = new ArrayList<Book>();
		for (Book b : books) {
			if (b != null && min <= (int) b.getPrice() && (int) b.getPrice() <= max)
				find.add(b);
		}
		return find;
	}

	@Override
	public double getSumPriceOfBooks() {
		double sum = 0;
		for (Book b : books) {
			if (b == null)
				break;
			sum += b.getPrice();
		}
		return sum;
	}

	@Override
	public double getAvgPriceOfBooks() {
		return getSumPriceOfBooks() / getNumberOfBooks();
	}

	@Override
	public List<Book> groupBook(String genre) {
		List<Book> find = new ArrayList<Book>();
		for (Book b : books) {
			if (b == null)
				break;
			if (b instanceof Novel && ((Novel) b).getGenre().equals(genre)) {
				find.add(b);
			}
		}
		return find;
	}

	@Override
	public List<Book> monthlyBook(int month) {
		List<Book> find = new ArrayList<Book>();
		for (Book b : books) {
			if (b instanceof Magazine && ((Magazine) b).getMonth() == month)
				find.add(b);
		}

		return find;
	}
}
