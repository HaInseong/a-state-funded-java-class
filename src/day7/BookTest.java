package day7;

class Book {
	String title;
	String author;
	int price;
	
	Book(){
		this("이것이 자바다", "신용권", 36000);
	}
	Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	String getBookInfo(){
		return title +"   "+ author +"   "+ price;
	}
}

public class BookTest {
	public static void main(String[] arge) {
		Book book1 = new Book("자바의 정석", "남궁성", 27000);
		Book book2 = new Book("자바프로그래밍 첫 걸음", "권기현", 27000);
		Book book3 = new Book();
		Book book4 = new Book("Do it! 점프 투 자바", "이지스퍼블리싱", 21000);
		Book book5 = new Book("난생처음 자바 프로그래밍", "우재남", 29000);
		
		System.out.println(book1.getBookInfo());
		System.out.println(book2.getBookInfo());
		System.out.println(book3.getBookInfo());
		System.out.println(book4.getBookInfo());
		System.out.println(book5.getBookInfo());
	}

}
