package lambdastream;

import java.util.stream.Stream;

public class StreamExample7 {

	public static void main(String[] args) {
		Stream.of("3", "1", "4", "2", "5", "5")
		.map(x -> {
			System.out.println("map : " + x);
			return Integer.parseInt(x);
		}).filter(x -> {
			System.out.println("filter : " + x);
			return x > 1;
		});
		//ex6와 비교, 최종 연산이 수행된 이후에 모든 연산이 실행된다.
		//최종 연산이 있어야 수행된다.
	}
}
