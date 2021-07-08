/* 두 정수를 키보드로 입력받아서
 * 결과값을 출력하세요.
 * 
 * 1. 두 수와 결과값 선언
 * 2. 수를 각각 키보드입력받기
 * 3. 결과값 구하기(두수의 합)
 * 4. 결과값 출력하기
 */
package kr.co.job;

import java.util.Scanner;

public class BasicTest03 {

	public static void main(String[] args) {
		// 선언
		int num1 = 0, num2 = 0, result = 0;
		Scanner scan;   // 선언
		scan = new Scanner(System.in);  //생성
		
		// 두수 입력
		System.out.print("First number : ");
		num1 = scan.nextInt();
		
		System.out.print("Second number : ");
		num2 = scan.nextInt();
		
		//처리
		result = num1 + num2;
		
		//출력
		System.out.println("결과값 출력 : " + result);

	}

}
