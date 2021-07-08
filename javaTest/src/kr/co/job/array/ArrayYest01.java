package kr.co.job.array;

import java.util.Arrays;

public class ArrayYest01 {

	public static void main(String[] args) {
		//배열 or 리스트: 같은 타입의 변수를 하나의 묶음으로 다루는것 
//		int[] score;
//		score = new int[5];
		int[] score = new int[5];
		//초기화  init()
		for(int i=0;i<score.length;i++) {
			score[i] = 0;
		}
		
//		score[0] = 55;//~ score[4] = 11
		//배열에 랜덤으로 1~100까지 수를 대입하기.
		//입력
		for(int i=0;i<score.length;i++) {
			score[i] = (int)(Math.random()*100)+1;
		}
		
		//출력화면예시  score[0] = ?? 
		for(int i=0;i<score.length;i++) {
			System.out.println("score["+i+"] = " + score[i]);
		}
		//단순 배열의 값을 출력
		System.out.println(Arrays.toString(score));	
		
	}

}
