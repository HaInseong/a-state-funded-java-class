package day9.mobile;

public class Otab extends Mobile {
	public Otab() {}
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}
	
	@Override
	public void operate(int time) {
//		super.setBatterySize(super.getBatterySize()-(time*12));
		setBatterySize(getBatterySize()-(time*12));
		//당장 여기에는 구현된 메서드가 없지만 조상에 있는 메서드가 대신 호출된다.
		//자식 클래스 안에 부모와 같은 메서드가 있어서 사용시 부모의 메서드와 구분이 필요하다면 super.을 사용한다.
	}
	public void charge(int time) {
		super.setBatterySize(super.getBatterySize()+(time*8));
	}

}
