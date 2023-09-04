package day13.collection;

import java.util.HashSet;

public class ProductTest {

	public static void main(String[] args) {
		HashSet<Product> set = new HashSet<>();
		
		Product product1 = new Product("p100", "TV", "20000");
		Product product2 = new Product("p200", "Computer", "10000");
		Product product3 = new Product("p100", "MP3", "700");
		Product product4 = new Product("p300", "Audio", "1000");
		
		
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
		
		for(Product pd : set) {
			System.out.println(pd.getProductID() + "\t\t" + pd.getProductName() + "\t\t" + pd.getProductPrice());
		}
		
		
	}

}
