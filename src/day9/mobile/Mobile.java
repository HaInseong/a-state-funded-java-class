package day9.mobile;

abstract class Mobile {
	//접근제어자 멤버변수
	private String mobileName;
	private int batterySize;
	private String osType;
	
	//생성자
	public Mobile() {}
	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
	
	//추상 메서드
	public abstract void operate(int time);
	public abstract void charge(int time);
	
	//Getter, Setter
	public String getMobileName() {
		return mobileName;
	}
	public void setMobileName(String mobileName) {
		this.mobileName = mobileName;
	}
	public int getBatterySize() {
		return batterySize;
	}
	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}
	public String getOsType() {
		return osType;
	}
	public void setOsType(String osType) {
		this.osType = osType;
	}
	
	
}
