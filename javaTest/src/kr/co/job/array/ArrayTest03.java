package kr.co.job.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		// 
		int sum=0;
		float avg = 0f;
		int max = 0;  // 넌 최대값이야.
		int min = 0;  // 
		
		int[] score = {55, 88, 96, 99, 90, 85,75,11,5};
		// 해당 배열에서 최대값과 최소값을 구하세요.
		min = score[0];
		max = score[0];
		
		for(int i=1;i<score.length;i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(min>score[i]) {
				min = score[i];
			}
		}
		System.out.println(max);
		
		
		
		
		
		
		
		
		System.out.println("--------------------------");
		//합 구하기
		for(int i=0;i<score.length;i++) {
			sum += score[i];
		}
		//평균
		avg = sum / (float)score.length;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

	}

}
