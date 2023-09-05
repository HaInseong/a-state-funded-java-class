package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest {
	public static void main(String[] args) throws Exception {
//		URL url = new URL("http://unico2013.dothome.co.kr/test_utf8.html");
		URL url = new URL("http://unico2013.dothome.co.kr/test_euckr.html"); //브라우저는 인코딩 타입 상관없이 잘 렌더링 해줬지만 이클립스는 UTF-8만 읽을 수 있음
		InputStream is = url.openStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "EUC-KR")); //드물게 EUC-KR 만들어진 사이트를 읽어야한다면 InputStreamReader 써야함
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
