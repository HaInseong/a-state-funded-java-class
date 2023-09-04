package day13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person implements Comparable<Person> { //인터페이스가 가지고 있는 추상메서드 다 오버라이딩해줘야한다.
	public String name;
	public int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int compareTo(Person o) { //어떤 객체가 더 크고 작은지 체크할 필요가 있을 때 사용한다. 기준은 객체마다 다르다, 이름의 길이가 될수도..
		//오름차순에 기반한 compareTo 만드는 방법, 매개변수가 더 크면 양의값 리턴하면 내림차순이 된다.
		if(age<o.age) return -1; //매개변수가 더 크면 음의값 리턴
		else if(age == o.age) return 0;
		else return 1; //필드가 더 크면 양의값 리턴 
	}

	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
}

public class CollectionSort2 {
	public static void main(String[] args) {
		List<Person> list = new LinkedList<>(); // ★ 왜 LinkedList로 전부 통일하지 않았는지? = 이유없음
		Random rand = new Random();
		for(int i=1; i <= 10; i++) {
//			list.add(new Person("duke"+i, new Random().nextInt(30))); 반복문 안에서의 객체 생성은 하지않아야한다.
			list.add(new Person("duke"+i, rand.nextInt(30)+1));
		}

		System.out.println(list);
		
		Collections.sort(list); //sort메서드는 아무 객체나와서는 안되며, list안에 담겨있는 객체들이 Comparable을 추가 상속하는 List 객체만 매개변수로 사용 가능하다.
		//동일한 객체인지 확인하고 싶을 때는 hashCode, equals 메서드를 오버라이딩 해야하지만
		//객체의 크고 작음을 체크하고 싶을 때는 Comparable을 추가 상속해야한다.
		//리턴값이 있으면 리스트 객체를 또 한번 만들게 되므로 void이다.
		//void이므로 값을 저장하지 않으므로 sorting 하기 전의 값이 필요하다면 복제를 해야한다.
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);	
		Collections.reverse(list); //내림차순으로 출력
		System.out.println("\nlist의 데이터들을 내림차순으로 소팅한 결과 : " + list);
	}
}

