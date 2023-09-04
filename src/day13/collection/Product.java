package day13.collection;

import java.util.Objects;

public class Product {
	private String productID;
	private String productName;
	private String productPrice;
	
	Product() {}
	Product(String productId, String productName, String productPrice) {
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
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o != null && o instanceof Product) {
			Product p = (Product) o;
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
//		return "(" + productID + ":" + productName + ":" + productPrice + ")";
		return productID + "\t" + productName + "\t" + productPrice;
		//return String.format("%-10s", productId); toString을 오버라이딩해서 이런식으로 Test에서 메서드 호출로 출력 가능.
	}

}
