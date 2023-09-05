package day13;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;
//Scanner가 가장 발전한 I/O API이므로 가장 편하다.
public class ScannerFromFile {
	public static void main(String args[]) {
		File f = new File("c:/iotest/output.txt");
		try (Scanner scan = new Scanner(f);) {
			if(new Random().nextBoolean()) { 
				System.out.println("[ 행 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.nextLine()); //행 단위로 읽는 메서드
			} else {
				System.out.println("[ 워드 단위 ]");
				while(scan.hasNext()) 
					System.out.println(scan.next()); //워드 단위로 읽는 메서드
			}
		} catch (FileNotFoundException e) { //Scanner 객체 생성하면서 파일 오픈할 때의 예외처리이다.
			System.out.println("파일이 존재하지 않네요...ㅜ");
		}					
	}
}
