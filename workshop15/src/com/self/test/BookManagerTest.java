package com.self.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import com.self.exception.UserException;
import com.self.service.BookManagerImpl;
import com.self.vo.child.Magazine;
import com.self.vo.child.Novel;
import com.self.vo.parent.Book;

public class BookManagerTest {

	public static void main(String[] args) {
		BookManagerImpl service = BookManagerImpl.getInstance();

//				new Magazine(1, "National Geographic", "Susan Goldberg", "National Geo", 12000, 1),
//				new Magazine(2, "TIME", "Sam Jacobs", "TIME USA", 11000, 1),
//				new Magazine(3, "TIME", "Sam Jacobs", "TIME USA", 11000, 2),
//				new Magazine(4, "Vogue", "Anna Wintour", "Condé Nast", 9000, 1),
//				new Magazine(5, "Vogue", "Anna Wintour", "Condé Nast", 9000, 4),
//				new Novel(6, "해리 포터와 마법사의 돌", "J.K. 롤링", "문학수첩", 18000, "판타지"),
//				new Novel(7, "데미안", "헤르만 헤세", "민음사", 15000, "철학"),
//				new Novel(8, "개미", "베르나르 베르베르", "열린책들", 14000, "철학"),
//				new Novel(9, "소년이 온다", "한강", "창비", 13000, "사회문화"), 
//				new Novel(10, "구해줘", "기욤뮈소", "밝은세상", 14000, "추리"),
//				new Book(11, "지워줘", "강민기", "내세상", 500), 
//				new Magazine(12, "고쳐줘", "강민기", "내세상", 500, 10),
//				new Novel(13, "고쳐줘", "강민기", "내세상", 500, "고칠게")));

		// 1. Book 을 등록한다.
		try {
			service.insertBook(new Magazine(1, "National Geographic", "Susan Goldberg", "National Geo", 12000, 1));
			service.insertBook(new Magazine(2, "TIME", "Sam Jacobs", "TIME USA", 11000, 1));
			service.insertBook(new Magazine(3, "TIME", "Sam Jacobs", "TIME USA", 11000, 2));
			service.insertBook(new Magazine(4, "Vogue", "Anna Wintour", "Condé Nast", 9000, 1));
			service.insertBook(new Magazine(5, "Vogue", "Anna Wintour", "Condé Nast", 9000, 4));
			service.insertBook(new Novel(6, "해리 포터와 마법사의 돌", "J.K. 롤링", "문학수첩", 18000, "판타지"));
			service.insertBook(new Novel(7, "데미안", "헤르만 헤세", "민음사", 15000, "철학"));
			service.insertBook(new Novel(8, "개미", "베르나르 베르베르", "열린책들", 14000, "철학"));
			service.insertBook(new Novel(9, "소년이 온다", "한강", "창비", 13000, "사회문화"));
			service.insertBook(new Novel(10, "구해줘", "기욤뮈소", "밝은세상", 14000, "추리"));
			service.insertBook(new Book(11, "지워줘", "강민기", "내세상", 500));
			service.insertBook(new Magazine(12, "고쳐줘", "강민기", "내세상", 500, 10));
			service.insertBook(new Novel(13, "고쳐줘", "강민기", "내세상", 500, "고칠게"));
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
		// 2. 등록된 Book 중 지우고싶은 isbn 을 지정해서 지운다.
		try {
			service.deleteBook(11);

		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

		// 3. 등록된 Book을 update한다.
		try {
			service.updateBook(new Magazine(12, "Maxim", "editor", "Maxim", 1000, 1));
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
		try {
			service.updateBook(new Novel(13, "해리 포터와 마법사의 돌", "J.K. 롤링", "문학수첩", 20000, "판타지"));
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}
		System.out.println("=========================================================================");
		// 4. isbn에 해당하는 책 가져온다.
		Book find = null;
		try {
			find = service.getBook(4);
		} catch (UserException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(find);

		System.out.println("==========================================================================");
		// 5. 등록된 모든 책 가져온다.
		try {
			ArrayList<Book> allBooks = service.getAllBook();
//			allBooks.sort(Comparator.comparing(Book::getTitle));
			for (Book b : allBooks) {
				System.out.println(b);
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("==========================================================================");
		// 6. 등록된 모든책의 개수를 가져온다.
		System.out.println("등록된 책의 총 개수는 " + service.getNumberOfBooks() + "개 입니다.");

		System.out.println("==========================================================================");
		// 7. 등록된 책중에 일치하는 title 책들만 가져온다.
		ArrayList<Book> findBooks;
		try {
			findBooks = service.searchBookByTitle("해리 포터와 마법사의 돌");
			for (Book b : findBooks) {
				System.out.println(b);
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("==========================================================================");
		// 8. 등록된 책중에 min ~ max 범위에 해당하는 가격의 책들을 가져온다.
		ArrayList<Book> priceBooks;
		try {
			priceBooks = service.searchBookByPrice(15000, 20000);
			for (Book b : priceBooks) {
				System.out.println(b);
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("==========================================================================");
		// 9. 등록된 모든책의 가격을 합한 값을 가져온다.
		System.out.println("등록된 책들의 총 합계는 " + service.getSumPriceOfBooks() + "원 입니다.");

		System.out.println("==========================================================================");
		// 10. 등록된 모든책의 가격을 평균한 값을 가져온다.
		System.out.println("등록된 책들의 총 평균은 " + service.getAvgPriceOfBooks() + "원 입니다.");

		System.out.println("==========================================================================");
		// 11. 등록된 모든책들 중 종류가 소설책이고 검색한 장르의 책만 가져온다.
		ArrayList<Book> genreBook;
		try {
			genreBook = service.groupBook("철학");
			for (Book b : genreBook) {
				System.out.println(((Novel) b).getGenre() + "에 해당하는 책들은 " + b);
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

		System.out.println("==========================================================================");
		// 12. 등록된 모든책들 중 종류가 잡지이고 검색한 달에 출간된 책만 가져온다.
		ArrayList<Book> monthBooks;
		try {
			monthBooks = service.monthlyBook(112);
//			monthBooks.sort(Comparator.comparing(Book::getIsbn).reversed());
			for (Book b : monthBooks) {
				System.out.println(((Magazine) b).getMonth() + "월에 출간한 잡지는 " + b);
			}
		} catch (UserException e) {
			System.err.println(e.getMessage());
		}

	}

}
