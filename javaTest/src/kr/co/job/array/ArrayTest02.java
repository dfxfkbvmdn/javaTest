package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열 배열 5개를 선언한 후 이름을 키보드로 입력받으세요
		String[] name;	//선언
		name = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			name[i] =scan.next();
			System.out.println(name[i]);
		}
		
		scan.close();
		
		
	}

}
