/* 두수을 입력받아서
 * 작은수에서 큰수까지 합을 구하세요!
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		// 작은수: num1 큰수 : num2
		Scanner scan = new Scanner(System.in);
		int num1, num2, sum=0;
		
		System.out.print("first num : ");
		num1 = scan.nextInt();
		
		System.out.print("Second num : ");
		num2 = scan.nextInt();
		
		for(int i=num1;i<=num2 ;i++) {
			sum = sum + i;
			System.out.println("i="+i+"일때, sum=" + sum);
			// i가 10일때 멈추자.
			if(i==10) {
				continue;//break;
			}
			System.out.println("=================");
		}
		
		System.out.println("End!");
		

	}

}







