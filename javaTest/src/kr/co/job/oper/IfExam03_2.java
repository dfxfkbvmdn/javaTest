/*
 * 점수를 입력받아서 성적(A~F)을 출력하세요
 * 점수가
 * 97이상이면 A+, 96~94이면 A0 , 93이하이면 A-
 * 87이상이면 B+, 86~84이면 B0 , 83이하이면 B-
 * 77이상이면 C+, 76~74이면 C0 , 73이하이면 C-
 * 67이상이면 D+, 66~64이면 D0 , 63이하이면 D-
 * 로 성적을 출력하세요
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_2 {

	public static void main(String[] args) {
		int score = 0; // 점수
		Scanner scan = new Scanner(System.in);
		char ch ='Z';
		char buho = '0';// 부호 : + , -, 0
		
		System.out.print("점수 입력 : ");
		score = scan.nextInt();
		
		if(score >= 90 && score <=100) {  //90이상이면
			ch = 'A';
			
		}else if(score >= 80){  // 80이상이면
			ch = 'B';
			
		}else if(score >= 70){  // 70이상이면
			ch = 'C';
			
		}else if(score >= 60){  // 60이상이면
			ch = 'D';
			
		}else {   // 60미만
			ch = 'F';
		}
		// 부호처리를 위한 실행문  %나머지연산
		if(score >=60 && score<=100) {
			if(score%10 >=7) {
				buho = '+';
			}
			else if(score%10 <=3) {
				buho = '-';
			}
		}
		
		// 당신의 점수는 ??점이고, 성적은 ??입니다.
		System.out.println("당신의 점수는 " + score + "점이고, 성적은 " + ch +buho +"입니다");
		System.out.println("Program End!");
	}

}









