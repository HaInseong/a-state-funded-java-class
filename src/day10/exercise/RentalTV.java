package day10.exercise;

public class RentalTV extends TV implements Rentable {
	private int price;

	public RentalTV() {
	}

	public RentalTV(int price, String model, int size, int channel) {
		super(model, size, channel); //super 생성자는 가장 먼저 와야한다.
		this.price = price;
//		super.setModel(model);
//		super.setSize(size);
//		super.setChannel(channel);
	}

	public void play() {
		System.out.println("대여 TV 채널 " + super.getChannel() + "번의 프로를 플레이합니다.");
	}

	public void rent() {
		System.out.printf(super.getModel() + " 모델의 상품을 대여합니다." + " %,d원을 지불해 주세요.\n", price);
	}

	@Override
	public String toString() {
		String model = String.format("모델명(%s)", super.getModel());
		String price = String.format("가격(%,d원)", this.getPrice());
		String size = String.format("크기(%d)", super.getSize());
		
		String productInfo = String.format("대여상품정보 : %s, %s, %s", model, price, size);
		
		return productInfo;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
