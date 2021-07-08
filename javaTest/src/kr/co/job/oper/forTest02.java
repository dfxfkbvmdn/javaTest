/*
 * 1. 정수를 입력받고
 * 2. 1부터 입력받은 수까지 순서대로 출력
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class forTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("숫자 입력 : ");
		num = scan.nextInt();
		
		//1부터 입력받은 수까지 순서대로 출력
		for(int i=1;i<= num;i++) {
			System.out.println(i);
		}

	}

}
