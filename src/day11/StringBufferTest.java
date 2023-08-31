package day11;

public class StringBufferTest {

	public static void main(String[] args) {		
		StringBuffer buffer = new StringBuffer(); //문자열을 저장할 버퍼 생성
		String str = "자바프로그래밍";
     	buffer.append(str); //생성한 버퍼 안에 문자열을 추가, 삽입, 삭제 등의 작업을 할 수 있다.

        System.out.printf("%s\n", buffer);
        buffer.reverse();
        System.out.printf("%s\n", buffer); //밍래그로프바자 출력
        System.out.printf("길이 : %d\n", buffer.length());
        buffer.append(str);
        buffer.append(str);
        buffer.append(str);
        System.out.printf("%s\n", buffer);
        
        StringBuffer bf1 = new StringBuffer("가나다");
        StringBuffer bf2 = new StringBuffer();
        bf2.append("가나다");
        System.out.printf("%b\n", bf1.equals(bf2)); //equals는 Object의 메서드이다. 이는 오버라이딩 하지 않은 경우 참조값을 비교하는 등가(==)와 같다.
        System.out.printf("%b\n", bf1 == bf2);
        System.out.printf("%b\n", bf1.toString().equals(bf2.toString())); //내용과 내용을 비교하는 equals를 안가지고 있으니 둘다 toString으로 변환해서 비교한다.
	}
}










