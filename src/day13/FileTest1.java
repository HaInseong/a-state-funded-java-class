package day13;

import java.io.File;
import java.util.Scanner;

public class FileTest1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("생성하려는 디렉토리명을 작성하세요 : "); //프로그램으로 생성하거나 외부에서 만든건 이클립스에서 바로 인식 안된다. 리프레쉬 해줘야 함.
		String dirName = scan.nextLine();
		File f = new File(dirName);
		if (f.exists()) {
			System.out.println(dirName + "명의 디렉토리가 존재합니다.");
		} else {
			if (f.mkdirs()) { //mkdirs?? = 디렉토리 만들어라
				System.out.println(dirName + "명의 디렉토리가 생성되었습니다.");
			} else {
				System.out.println(dirName + "명의 디렉토리 생성에 실패했습니다.");
			}
		}
		scan.close();
	}
}
