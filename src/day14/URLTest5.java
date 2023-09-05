package day14;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest5 {
	public static void main(String[] args) throws Exception {
		URL url = new URL("https://www.kobis.or.kr/kobis/business/main/main.do");
		//어떤 사이트든 url 문자열을 지정해서 원하는 content를 끌어올 수 있다.
		//끌어와서 추출할 줄 알아야하는데, json 프로그래밍, dom프로그래밍 할 줄 알아야함
		InputStream is = url.openStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
		String line = null;

		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
