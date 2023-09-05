package day13;
//남이 만든 클래스라면? = Comparable 인터페이스를 상속할 수 없는 경우
//남의 소스인 Person2를 손댈수 없다는 전제하에 CompareTo 메서드를 오버라이딩 할 수 없으므로 PersonComparator 클래스를 만들어서 비교에 사용한다.
//Comparable를 추가 상속하고 있다면 바로 sort를 사용하면 된다.
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

class Person2 {
	public String name;
	public int age;

	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {		
		return name+"("+age+")";
	}	
}

//Comparator는 특정 클래스만 비교하게 만드는 비교자 클래스인데 PersonComparator는 Person2객체를 비교하는 비교자의 역할인 클래스를 만들어서 따로 적용해주는 방법이다. 이유는 Comparable를 추가 상속하지 못하기 때문.
class PersonComparator implements Comparator<Person2> { //Comparator인터페이스는 compare(T o1, T o2)를 오버라이딩 해줘야한다.
	@Override
	public int compare(Person2 o1, Person2 o2) {
		if (o1.age < o2.age)
			return -1;
		else if (o1.age > o2.age)
			return 1;
		else 
			return 0;
	}	
}

public class CollectionSort3 {
	public static void main(String[] args) {
		List<Person2> list = new LinkedList<>();
		
		for(int i=1; i <= 10; i++) {
			list.add(new Person2("duke"+i, new Random().nextInt(30)));
		}

		System.out.println(list);
				
		list.sort(new PersonComparator());
		System.out.println("\nlist의 데이터들을 오름차순으로 소팅한 결과 : " + list);		
	}
}
