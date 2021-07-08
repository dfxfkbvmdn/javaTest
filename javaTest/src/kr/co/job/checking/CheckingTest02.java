/*
 * 두 수를 키보드로 입력받아서
 * 두 수의 값을 서로 교환하자.
 *  
 */
package kr.co.job.checking;

import java.util.Scanner;

public class CheckingTest02 {

	public static void main(String[] args) {
		// 
		Scanner scan = new Scanner(System.in);
		int num1=0, num2=0, temp=0;
		
		System.out.print("first : ");
		num1 = scan.nextInt();
		
		System.out.print("second : ");
		num2 = scan.nextInt();
		System.out.println("====[교환 전]===========");
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		//교환 : swap
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("====[교환 후]===========");
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		
	}

}










