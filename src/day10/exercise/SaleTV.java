package day10.exercise;

public class SaleTV extends TV {
	private int price;

	public SaleTV() {
	}

	public SaleTV(int price, String model, int size, int channel) {
		this.price = price;
		super.setModel(model);
		super.setSize(size);
		super.setChannel(channel);
	}

	public void play() {
		System.out.println("판매 TV 채널 " + super.getChannel() + "번의 프로를 플레이합니다.");
	}

	public void sale() {
		System.out.printf(super.getModel() + " 모델의 상품을 판매합니다." + " %,d원을 지불해주세요.\n", price);
	}
	
	@Override
	public String toString() {
		String model = String.format("모델명(%s)", super.getModel());
		String price = String.format("가격(%,d원)", this.getPrice());
		String size = String.format("크기(%d)", super.getSize());
		
		String productInfo = String.format("판매상품정보 : %s, %s, %s", model, price, size);
		
		return productInfo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
