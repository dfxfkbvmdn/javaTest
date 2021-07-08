/*
 * P170 : 입력받은 숫자의 각 자리의 합 구하기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		int num = 0 , sum = 0 ;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요 : ");
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);
//		num = Integer.parseInt(scan.nextLine());
//   345	=>34	=>3
		while(num!=0) {
			sum += num%10; //  sum = sum + 3
			System.out.println("sum=" + sum + " num=" + num);
			
			num /= 10;  //num = num / 10;
		}
		System.out.println("각 자리수의 합 : " + sum);

	}

}




