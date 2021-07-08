package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		// 문자열 배열 5개를 선언한 후 5명의 이름을 키보드 입력받으세요
		int nameCount = 5;
		String[] name;  //선언
		name = new String[nameCount];
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i< nameCount; i++) {
			System.out.print("이름 : ");
			name[i] = scan.next();
		}
		
		System.out.println(Arrays.toString(name));
		

	}

}
