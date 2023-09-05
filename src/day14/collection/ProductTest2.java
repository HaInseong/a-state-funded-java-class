package day14.collection;

import java.util.Collections;
import java.util.LinkedList;

public class ProductTest2 {

	public static void main(String[] args) {
		LinkedList<Product2> productList = new LinkedList<>();

		// 배열에 객체들을 담으면 반복문을 사용할 수 있다.
		// 변수에 각각 담으면 반복문을 사용할 수 없다.

		Product2[] productArray = new Product2[4];

		productArray[0] = new Product2("p100", "TV", 20000);
		productArray[1] = new Product2("p200", "Computer", 10000);
		productArray[2] = new Product2("p100", "MP3", 700);
		productArray[3] = new Product2("p300", "Audio", 1000);

		for (Product2 productInfo : productArray) {
			if (productList.contains(productInfo)) {
				System.out.println("동일한 ID 의 제품이 이미 저장되어 있습니다.");
			} else {
				productList.add(productInfo);
				System.out.println("성공적으로 저장되었습니다.");
			}
		}

		System.out.println();

		System.out.println("제품 ID" + "\t" + "제품명" + "\t" + "가격");
		System.out.println("-------------------------------------");

		Collections.sort(productList);

		for (Product2 printProduct : productList) {
			System.out.println(printProduct);
		}

	}
}
