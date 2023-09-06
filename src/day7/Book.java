package day7;


//book 클래스 객체5개 생성 , 각각 변수 저장, 각각의 책정보를 행단위출력p
public class Book {
	public String title; 
	public String author;
	public int price; //디폴트 제어자이기 때문에 다른 패키지에서 사용 못하므로 getPrice() 만들어줌
	
	public Book() {
		this("이것이 자바다", "신용권", 20000);
	}


	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String getBookInfo() {
		return "\"" + this.title + "\""+ " - " + this.author + " " + this.price;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {		
		return String.format("제목 : %-15s 저자 : %-15s 가격 : %s", title, author, price);
	}	
	
	
	
//	@Override
//	public int compareTo(Book o) { //어떤 객체가 더 크고 작은지 체크할 필요가 있을 때 사용한다. 기준은 객체마다 다르다, 이름의 길이가 될수도..
//		//오름차순에 기반한 compareTo 만드는 방법, 매개변수가 더 크면 양의값 리턴하면 내림차순이 된다.
//		if(price<o.price) return -1; //매개변수가 더 크면 음의값 리턴
//		else if(price == o.price) return 0;
//		else return 1; //필드가 더 크면 양의값 리턴 
//	}
	
}

//public class BookTest {
//	public static void main(String[] args) {
//		Book b1 = new Book();
//		System.out.println(b1.getBookInfo());
//		Book b2 = new Book("클린코드", "로버트c마틴", 250000);
//		System.out.println(b2.getBookInfo());
//		Book b3 = new Book("객체지향의 사실과 오해", "조영호", 18000);
//		System.out.println(b3.getBookInfo());
//		Book b4 = new Book("스프링 부트와 AWS로 혼자 구현하는 웹 서비스", "이동욱", 21000);
//		System.out.println(b4.getBookInfo());
//		Book b5 = new Book("성공과 실패를 결정하는 1%의 네트워크 원리", "Tsutomu Tone", 28000);
//		System.out.println(b5.getBookInfo());
//	}
//}
