package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// 단수를 입력받아서 해당 단을 출력하세요
		int dan =0;
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("구할 단 입력 : ");
		dan = 2;		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		dan = 3;		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		dan = 4;		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		dan = 9;		
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		// 1회 실행
		for(dan=2;dan<=9;dan++) {
			// 8회
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				// 8 * 9 회
			}
			// 8회
		}

		//1회
	}

}




