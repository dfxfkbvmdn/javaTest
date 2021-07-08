/*
 * 10개 배열을 생성하여 배열의값을 0~9까지 순차적으로 초기화하고
 * 해당 배열값을 섞어보기
 */
package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 
		int[] numArr = new int[10];
		int n=0, temp=0;
		
		for(int i=0;i<numArr.length;i++) {
			numArr[i] = i; //배열을 0~9 숫자로 초기화
			System.out.print(numArr[i]);
		}
		
		//
		for(int i=1;i<100;i++) {// 100회 반복
			n = (int)(Math.random()*10);  // 임의의 인덱스값 받아서 대입
			
			// numArr[0]과 numArr[n]을 서로 교환
			temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;
		}
		System.out.println(Arrays.toString(numArr));

	}

}





