package day14.collection;

import java.util.Objects;


public class Product2 implements Comparable<Product2> {
	private String productID;
	private String productName;
	private int productPrice; //int형으로 변환해서 푸세요.
	
	Product2() {}
	Product2(String productId, String productName, int productPrice) {
		this.productID = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product2) {
			Product2 p = (Product2) o;
			if (productID.equals(p.productID) )
				return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(productID);
	}
	
	@Override
	public String toString() {
		return String.format("%-5s %-10s %,d원", productID, productName, productPrice);
	}
	
	@Override
	public int compareTo(Product2 o) { //어떤 객체가 더 크고 작은지 체크할 필요가 있을 때 사용한다. 기준은 객체마다 다르다, 이름의 길이가 될수도..
		if(productPrice<o.productPrice) return 1; 
		else if(productPrice == o.productPrice) return 0;
		else return -1; 
	}

}
