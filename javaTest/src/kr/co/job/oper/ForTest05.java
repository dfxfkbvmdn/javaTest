/*
 * 다양한 for문들 
 * 1. 시작값 끝값까지 입력받아 모든 홀수의 합
 * 2. 1+2+3...+10 = 55 출력해보기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		//선언
		Scanner scan = new Scanner(System.in);
		int startValue, lastValue;
		
		//입력
		System.out.print("시작값 입력 :");
		startValue = scan.nextInt();
		
		System.out.print("끝값 입력 : ");
		lastValue = scan.nextInt();
		
		// 처리 : 모든홀수만 출력
		for(int i=startValue; i<=lastValue;i++) {
			if(i%2 == 1) {  // i%2 != 0
				System.out.print(i + " ");
			}
		}
		
		System.out.println("=======  ============");
		int sum = 0;
//		 1+2+3...+10 = 55 출력해보기
		for(int i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
			if(i !=10) {
				System.out.print("+");
			}else {
				System.out.print(" ");
			}
		}
		System.out.println("= "+sum);
		

	}

}








