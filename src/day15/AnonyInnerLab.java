package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import day7.Book;

//class BookComparator implements Comparator<Book> {
//	@Override
//	public int compare(Book o1, Book o2) {
//		if (o1.price < o2.price)
//			return -1;
//		else if (o1.price > o2.price)
//			return 1;
//		else
//			return 0;
//	}
//}

public class AnonyInnerLab {

	public static void main(String[] args) {
		ArrayList<Book> book = new ArrayList<>();

		book.add(new Book("자바의 정석", "남궁성", 27000));
		book.add(new Book("챗GPT", "반병현", 11700));
		book.add(new Book("스타트 스프링 부트", "남가람", 27000));
		book.add(new Book("Doit! 자바프로그래밍", "박은종", 22500));
		book.add(new Book("이것이 자바다", "신용권, 임경균", 36000));

		System.out.println("[실행 결과]");
		for (Book bookList : book) {
			System.out.println(bookList);
		}

		Collections.sort(book, new Comparator<Book>() { //익명 클래스의 부모는 객체생성식인 Comparator이 된다.
			public int compare(Book o1, Book o2) {
				if (o1.price < o2.price)
					return -1;
				else if (o1.price > o2.price)
					return 1;
				else
					return 0;
			}
		});

		System.out.println();
		System.out.println("[소팅 후]");

		for (Book bookList : book) {
			System.out.println(bookList);
		}

	}

}
