package day13.collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();
		
		//배열에 객체들을 담으면 반복문을 사용할 수 있다.
		//변수에 각각 담으면 반복문을 사용할 수 없다.
		Product product1 = new Product("p100", "TV", "20000");
		Product product2 = new Product("p200", "Computer", "10000");
		Product product3 = new Product("p100", "MP3", "700");
		Product product4 = new Product("p300", "Audio", "1000");
		
		
		//HashSet에서 객체를 출력하기 위해 Iterator나 향상된 for문 사용해야한다.
		
		if(set.add(product1)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		if(set.add(product2)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		if(set.add(product3)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		if(set.add(product4)) {
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
		
		System.out.println();
		
		System.out.println("제품ID" + "\t\t" + "제품명" + "\t\t" + "가격");
		
		System.out.println("-----------------------------------------");
		
		for(Product pd : set) { //set은 추출방법이 없으므로 추출하려면 enhancementFor나 Iterator를 써야한다.
			System.out.println(pd.getProductID() + "\t\t" + pd.getProductName() + "\t\t" + pd.getProductPrice());
		}
	}

}
