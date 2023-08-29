package day8.practice;

public class FriendTest {
	public static void main(String args[]) {

		Friend[] friends = new Friend[5];

		friends[0] = new Friend("인성1", "01092975639", "his@naver.com");
		friends[1] = new Friend("인성2", "01092975639", "his@naver.com");
		friends[2] = new Friend("인성3", "01092975639", "his@naver.com");
		friends[3] = new Friend("인성4", "01092975639", "his@naver.com");
		friends[4] = new Friend("인성5", "01092975639", "his@naver.com");
	
		System.out.println("이름	전화번호		메일주소");
		System.out.println("--------------------------------------------------");
		for (Friend friend : friends) {
			System.out.println(friend.getInfo());
		}
	}
}
