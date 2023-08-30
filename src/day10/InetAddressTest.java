package day10;
import java.net.*;
public class InetAddressTest {
	public static void main(String[] args) throws Exception {
		InetAddress inet = InetAddress.getLocalHost(); //생성자가 싱글톤이라서 팩토리메서드를 통해서 객체를 생성함.
		System.out.println(inet);
		inet = InetAddress.getByName("www.naver.com");
		System.out.println(inet);
	}
}
