/*
 * 두수를 입력받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드
 * void plusV(int n1,int n2);
 * minusV(), mulV(), divV()   => 메소드 이름 * 
 */
package kr.co.job.func;

public class ExamFunction02 {

	public static void main(String[] args) {
		// 3,5의 합구하기 => 메소드 수정하기
		int sum = plusV(3,5);
		System.out.println("3과 5의 합 : " + sum);
		
		// 3,10의 뺄셈
		minusV(3,10);
		// 5,4의 곱셈
		
		// 2, 8의 나눗셈
		
	}

	private static void minusV(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1 - n2);
	}

	private static int plusV(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1 + n2);
		return n1+n2;
	}

}







