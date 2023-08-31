package day11;
public class StringTest {
	public static void main(String[] args) {
		System.out.println("1".length());    				
		System.out.println("가나다".length()); 					
		System.out.println("abc".charAt(1)); 			
		System.out.println("abc".toUpperCase());	 
		
		String str1 = "ABCDEFGHIJ";
		String str2 = "abcdefgfhij";		
		System.out.println(str1.substring(4));     		        
		System.out.println(str1.substring(0, 3));  		
		System.out.println(str2.indexOf("f"));       		  
		System.out.println(str2.lastIndexOf("f")); //마지막 "f" 인덱스 번호
		System.out.println(str2.replace('h', 'H')); 	
		
		System.out.println("abc".repeat(5));
		System.out.println("@".repeat(3));
		
		String str3 = "java jdbc html5 css javascript servlet jsp ajax";
		String[] ary = str3.split(" ");  // 특히 유용하게 쓰임
		
		for(int i=0; i < ary.length; i++){
			System.out.println(ary[i]);
		}		
		char ch[] = str3.toCharArray(); //ch[]문자 배열에 str3문자열을 문자로 한글자씩 구분하여 대입.
		System.out.println(str3.length() + " ---- " + ch.length);
		for(int i=0; i < ch.length; i++){
			System.out.print(ch[i] + " ");
		}
	}
}













