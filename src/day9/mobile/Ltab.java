package day9.mobile;

public class Ltab extends Mobile {
	public Ltab() {}
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType); //어떤 클래스든 객체 생성 될 때는 super()가 자동으로 호출되므로 처음부터 super로 호출해서 처리하는게 효율적이다.
	}
	
	@Override 
	//Override를 제대로 했는지 체크하라는 어노테이션
	public void operate(int time) {
		super.setBatterySize(super.getBatterySize()-(time*10));
    }
	public void charge(int time) {
		super.setBatterySize(super.getBatterySize()+(time*10));		
	}
}

