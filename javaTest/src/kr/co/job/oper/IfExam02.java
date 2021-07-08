/*
 * 키보드로 두수를 입력받아서 큰지 작은지 비교하는 프로그램을 작성.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		//선언
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		// 입력
		System.out.println("첫번째 숫자 : ");
		num1 = Integer.parseInt(scan.next());
		
		System.out.println("두번째 숫자 : ");
		num2 = Integer.parseInt(scan.next());
		
		//처리
		if(num1>num2) {
			System.out.println("1");
		}
		else {
			System.out.println("2");
		}
		//출력
		
	}// end of main()

}// end of class
